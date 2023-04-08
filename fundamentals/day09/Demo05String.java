public class Demo05String {
  public static void main(String[] args) {
    // String() 创建一个空的字符串对象
    String s1 = new String();// 空字符串
    System.out.println("s1 = " + s1);
    // String(String original) 根据字符串来创建一个字符串对象
    String s2 = new String("abcde");
    System.out.println("s2 = " + s2);
    // String(char[] value) 通过字符数组来创建字符串对象
    char[] c = { 'a', 'b', 'c', 'd', 'e' };
    String s3 = new String(c);
    System.out.println("s3 = " + s3);
    // String(byte[] bytes) 通过字节数组来构造新的字符串对象
    byte[] b = { 97, 98, 99, 100, 101 };
    String s4 = new String(b);
    System.out.println("s4 = " + s4);
    // String(byte[] bytes, int offset, int length) 通过字节数组一部分来构造新的字符串对象
    String s5 = new String(b, 1, 2);
    System.out.println("s5 = " + s5);
    String s6 = "abcde";
    System.out.println("s6 = " + s6);

    // 字符串两种创建方式主要区别：
    // 1.通过new创建的字符串对象，每一次new都会申请一个内存空间，虽然内容相同但是地址值不同。
    // 2.通过""直接赋值创建，只要字符串序列相同，无论程序代码中出现几次，JVM只会建立一个String对象并在字符串池中维护。
    String s7 = new String("abcde");
    String s8 = "abcde";

    System.out.println("s2 = " + System.identityHashCode(s2));
    System.out.println("s7 = " + System.identityHashCode(s7));
    System.out.println("---------------");
    System.out.println("s6 = " + System.identityHashCode(s6));
    System.out.println("s8 = " + System.identityHashCode(s8));
  }
}
