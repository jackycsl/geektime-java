public class Demo06String {
  public static void main(String[] args) {
    // 创建字符串对象
    String s1 = "hello";
    String s2 = "hello";
    String s3 = "HELLO";
    // equals (Object anObject) :将此字符串与指定对象进行比较。
    System.out.println(s1.equals(s2));// true
    System.out.println(s1.equals(s3));// false
    // Object是对象的意思，也是一种引用类型。作为参数类型，表示任意对象都可以传递到方法作为参数。
    System.out.println("------------");
    // equalsIgnoreCase (String anotherString) :将此字符串与指定对象进 行比较，忽略大小写。
    System.out.println(s1.equalsIgnoreCase(s2));// true
    System.out.println(s1.equalsIgnoreCase(s3));// true
    System.out.println("------------");
    // contains (CharSequence s)` :判断参数字符串在当前字符串中是否存在(区 分大小写)。存在，返回true，否则，返回false。
    String s4 = "我喜欢Java，Java使我快乐!";
    System.out.println("字符串中农是否包含Java：" + s4.contains("Java"));// true
    System.out.println("字符串中农是否包含Java：" + s4.contains("java"));// false
    // endsWith(String suffix) :测试此字符串是否以指定的后缀结尾(区分大小 写)。
    String filename = "你懂得.mp4";
    System.out.println("文件名称是否以mp4结尾：" + filename.endsWith(".mp4"));// true
    System.out.println("文件名称是否以mp4结尾：" + filename.endsWith(".MP4"));// false
    // startsWith(String prefix) :测试此字符串是否以指定的前缀开始(区分大小写)
    System.out.println("文件名称是否以'你'开头" + filename.startsWith("你"));// true
  }
}
