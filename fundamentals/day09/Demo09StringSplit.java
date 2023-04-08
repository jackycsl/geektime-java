public class Demo09StringSplit {
  public static void main(String[] args) {
    // 创建字符串对象
    String s = "你懂得.mp4";
    // split(String regex) :将此字符串按照给定的regex(规则)拆分为字符 串数组。
    String[] strArr = s.split("[.]");// ["你懂得","mp4"]
    for (int i = 0; i < strArr.length; i++) {
      System.out.println(strArr[i]);
    }
    System.out.println("---------------------");
    // trim() :去掉当前字符串的前后空格，并返回一个新字符串，原字符串不变。
    String s2 = "        Java是   世界 上 最好的语言     ";
    System.out.println("去掉空格前：" + s2);// Java是 世界 上 最好的语言
    System.out.println("去掉空格后：" + s2.trim());// Java是 世界 上 最好的语言
  }
}
