/*
    字符串String详解，字符串是引用数据类型，而非基本数据类型！引用数据类型与基本数据类型的重大区别在于内存空间。
        特点：
        1.字符串不变：字符串的值在创建之后不能改变
        2.相同字符串"共享"：在内存只需要存储一份
        3.字符串底层原理是字节数组
        4.加法运算符具备串联字符串能力，同时还可以将其他数据类型转换为字符串
 */
public class Demo04String {
  public static void main(String[] args) {
    // 1.字符串不变：字符串的值在创建之后不能改变
    String s1 = "abc";
    s1 += "d";
    System.out.println(s1);
    // 内存中一共创建了三个对象："abc" "d" "abcd"
    // s1变量从"adc" 指向 "abcd"

    // 2.相同字符串"共享"：在内存只需要存储一份
    String s2 = "abcde";
    String s3 = "abcde";
    System.out.println("s2 内存地址= " + System.identityHashCode(s2));
    System.out.println("s3 内存地址= " + System.identityHashCode(s3));

    // 3.字符串底层原理是字节数组
    String s4 = "abc";
    char[] c5 = { 'a', 'b', 'c' };
    String s6 = new String(c5);
    System.out.println("s4 = " + s4);
    System.out.println("s6 = " + s6);
    // 4.加法运算符具备串联字符串能力，同时还可以将其他数据类型转换为字符串
    String s7 = "ab" + "c";
    String s8 = "a" + 1 + true + 0.1;
    System.out.println("s7 = " + s7);
    System.out.println("s8 = " + s8);
  }
}
