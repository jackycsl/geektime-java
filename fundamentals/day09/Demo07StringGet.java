public class Demo07StringGet {
  public static void main(String[] args) {
    // 创建字符串对象
    String s1 = "helloworld";
    // length () :返回此字符串的长度。
    System.out.println(s1.length());// 10
    System.out.println("----------");
    // concat (String str) :将指定的字符串连接到该字符串的末尾。
    String s2 = s1.concat("**hello abc");
    System.out.println("s2 = " + s2);// helloworld**hello abc
    System.out.println("----------");
    // charAt (int index) :返回指定索引处的 char值。
    System.out.println(s1.charAt(0));// h
    System.out.println(s1.charAt(1));// e
    System.out.println("----------");
    // indexOf (String str) :返回指定子字符串第一次出现在该字符串内的索引。
    System.out.println(s1.indexOf("l"));// 2
    System.out.println(s1.indexOf("owo"));// 4
    System.out.println(s1.indexOf("ak"));// -1
    System.out.println("----------");
    // lastIndexOf(String str) :返回指定子字符串最后一次出现的字符串中的索引。 如果不包含，则返回-1。
    System.out.println(s1.lastIndexOf("l"));// 8
    System.out.println(s1.lastIndexOf("owo"));// 4
    System.out.println(s1.lastIndexOf("ak"));// -1
    System.out.println("----------");
    // substring (int beginIndex)` :返回一个子字符串，从beginIndex开始截取字符串到字符串结尾。
    System.out.println(s1.substring(0));// helloworld
    System.out.println(s1.substring(5));// world
    System.out.println("----------");
    // substring (int beginIndex, int endIndex)
    // :返回一个子字符串，从beginIndex到endIndex截取字符串。含beginIndex，不含endIndex。
    System.out.println(s1.substring(0, s1.length()));// helloworld
    System.out.println(s1.substring(3, 8));// lowor
    System.out.println("----------");
  }
}
