import * as pulumi from "@pulumi/pulumi";
import * as aws from "@pulumi/aws";

// Get some configuration values or set default values.
const config = new pulumi.Config();
const instanceType = config.get("instanceType") || "t3.micro";
const vpcNetworkCidr = config.get("vpcNetworkCidr") || "10.0.0.0/16";
const publicKey = config.require("publicKey");

// Look up the latest Amazon Linux 2 AMI.
const ami = aws.ec2.getAmi({
    filters: [{
        name: "name",
        values: ["CentOS-7-*"],
    }, {
        name: "architecture",
        values: ["x86_64"],
    }, {
        name: "root-device-type",
        values: ["ebs"],
    }],
    owners: ["679593333241"],
    mostRecent: true,
}).then(invoke => invoke.id);


// Create VPC.
const vpc = new aws.ec2.Vpc("vpc", {
    cidrBlock: vpcNetworkCidr,
    enableDnsHostnames: true,
    enableDnsSupport: true,
});

// Create an internet gateway.
const gateway = new aws.ec2.InternetGateway("gateway", {vpcId: vpc.id});

// Create a subnet that automatically assigns new instances a public IP address.
const subnet = new aws.ec2.Subnet("subnet", {
    vpcId: vpc.id,
    cidrBlock: "10.0.1.0/24",
    mapPublicIpOnLaunch: true,
});

// Create a route table.
const routeTable = new aws.ec2.RouteTable("routeTable", {
    vpcId: vpc.id,
    routes: [{
        cidrBlock: "0.0.0.0/0",
        gatewayId: gateway.id,
    }],
});

// Associate the route table with the public subnet.
const routeTableAssociation = new aws.ec2.RouteTableAssociation("routeTableAssociation", {
    subnetId: subnet.id,
    routeTableId: routeTable.id,
});

// Create a security group allowing inbound access over port 80 and outbound
// access to anywhere.
const secGroup = new aws.ec2.SecurityGroup("secGroup", {
    description: "Enable HTTP access",
    vpcId: vpc.id,
    ingress: [{
        fromPort: 80,
        toPort: 80,
        protocol: "tcp",
        cidrBlocks: ["0.0.0.0/0"],
    }, { protocol: "tcp",
        fromPort: 22,
        toPort: 22,
        cidrBlocks: ["0.0.0.0/0"]
    },{
        fromPort: 6868,
        toPort: 6868,
        protocol: "tcp",
        cidrBlocks: ["0.0.0.0/0"],
    },],
    egress: [{
        fromPort: 0,
        toPort: 0,
        protocol: "-1",
        cidrBlocks: ["0.0.0.0/0"],
    }],
});

const keyPair = new aws.ec2.KeyPair("keypair", {publicKey: publicKey});

const userData = `#!/bin/bash
sudo yum install wget vim git -y
sudo yum install yum-utils device-mapper-persistent-data lvm2 -y
sudo yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo
sudo yum install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin -yy
sudo systemctl start docker
`;

// Create and launch an EC2 instance into the public subnet.
const server = new aws.ec2.Instance("server", {
    instanceType: instanceType,
    subnetId: subnet.id,
    vpcSecurityGroupIds: [secGroup.id],
    ami: ami,
    tags: {
        Name: "webserver",
    },
    keyName: keyPair.keyName,
    userData: userData,
});

// Export the instance's publicly accessible IP address and hostname.
export const ip = server.publicIp;
export const hostname = server.publicDns;
export const url = pulumi.interpolate`http://${server.publicDns}`;
