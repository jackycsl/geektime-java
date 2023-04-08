public class Demo11StringBuilderMethod {
  public static void main(String[] args) {
    // 创建任意对象
    StringBuilder sb = new StringBuilder();
    // StringBuilder append(任意类型)：添加数据，并返回对象本身
    StringBuilder sb2 = sb.append("hello");
    System.out.println("sb = " + sb);
    System.out.println("sb2 = " + sb2);
    System.out.println(sb == sb2);
    sb.append("hello");
    sb.append("world");
    sb.append("java");
    sb.append(100);
    sb.append(1.1);
    sb.append('A');
    System.out.println("sb = " + sb);// hellohelloworldjava1001.1A
    // 链式编程
    sb.append("hello").append("world").append("java").append(100).append(1.1).append('A');
    System.out.println("sb = " + sb);
    // StringBuilder reverse()：返回相反的字符序列
    sb.reverse();
    System.out.println("sb = " + sb);
  }
}
