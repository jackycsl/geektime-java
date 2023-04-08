public class Demo08StringChange {
  public static void main(String[] args) {
    // 创建字符串对象
    String s = "abcde";
    // toCharArray () :将此字符串转换为新的字符数组。
    char[] c = s.toCharArray();
    for (int i = 0; i < c.length; i++) {
      System.out.println(c[i]);
    }
    System.out.println("--------------");
    // getBytes () :使用平台的默认字符集将该 String编码转换为新的字节数组。
    byte[] bytes = s.getBytes();
    for (int i = 0; i < bytes.length; i++) {
      System.out.println(bytes[i]);
    }
    System.out.println("--------------");
    // toLowerCase() :使用默认语言环境的规则将此 String所有字符转换为小写。
    String s2 = "IT";
    System.out.println(s2.toLowerCase());// it
    System.out.println("--------------");
    // oUptperCase() :将此 String所有字符转换为大写，使用默认语言环境的规则。
    System.out.println(s.toUpperCase());// ABCDE
    System.out.println("--------------");
    // replace (CharSequence target, CharSequence replacement)
    // :将与target匹配的字符串使用replacement字符串替换。
    String s3 = "PHP是世界上最好的语言";
    String s4 = s3.replace("PHP", "Java");
    System.out.println("s4 = " + s4);// Java是世界上最好的语言
    System.out.println("--------------");
  }
}
