public class Demo12StringBuilderToString {
  public static void main(String[] args) {
    // StringBuilder to String：toString()方法
    StringBuilder sb = new StringBuilder("");
    sb.append("hello");
    // 错误做法
    // String s1 = sb;
    // 正确做法：
    String s2 = sb + "";
    System.out.println("s2 = " + s2);
    String s3 = sb.toString();
    System.out.println("s3 = " + s3);
    // String to StringBuilder：构造方法
    String s4 = "hello";
    StringBuilder sb2 = new StringBuilder(s4);
    System.out.println("sb2 = " + sb2);// hello
  }
}
