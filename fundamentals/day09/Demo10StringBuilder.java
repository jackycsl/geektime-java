//StringBuilder与String非常类似：最重要区别，StringBuilder是可变的，而String是不可变的。
public class Demo10StringBuilder {
  public static void main(String[] args) {
    // StringBuilder()：创建一个空白可变字符串对象，不含有任何内容
    StringBuilder sb = new StringBuilder();
    System.out.println("sb = " + sb);
    System.out.println("sb.length() = " + sb.length());
    // StringBuilder(String str)：根据字符串的内容，来创建可变字符串对象
    StringBuilder sb2 = new StringBuilder("hello");
    System.out.println("sb2 = " + sb2);
    System.out.println("sb2.length() = " + sb2.length());
  }
}
