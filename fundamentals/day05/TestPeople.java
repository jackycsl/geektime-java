public class TestPeople {
  public static void main(String[] args) {
    // 创建一个人对象
    People p = new People();
    // p.age = -100;//这里代码会出现编译错误，因为age被private修饰了，只能通过setAge访问修改
    // p.setAge(-10); // 提示年龄非法
    p.setAge(19);
    p.setName("雄哥");
    p.setAddr("北京");
    System.out.println(p.getAge());// 输出年龄：19
    System.out.println(p.getName());// 输出：雄哥
    System.out.println(p.getAddr());// 输出：北京
  }
}
// 从上面代码可以看出：成员变量age一旦私有以后，其他类就不能直接访问成员变量了，必须通过setAge来修改，通过getAge来访问。这样就实现了安全性，值得注意的是开发的时候，我们并不一定会在setAge中做参数的校验，因为可以在界面上提前校验用户输入的数据是否合法，但是即便如此，成员变量私有和提供配套的getter和setter方法已经成为Java设计的一种规范，建议大家都这样设计自己的代码。
