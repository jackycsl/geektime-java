import java.util.Scanner;

public class Test01CharStatistics {
  public static void main(String[] args) {
    // 1.键盘录入字符串，使用Scanner工具类读取字符串方法nextLine。
    Scanner sc = new Scanner(System.in);
    System.out.println("请您输入一个字符串数据：");
    String str = sc.nextLine();
    // 2.定义三个变量记录大写字母、小写字母及数字个数。
    int bigCount = 0;
    int smallCount = 0;
    int numCount = 0;
    // 3.获取字符串的字符数组，遍历字符数组中的字符进行统计
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      // 4.判断大写字母：字符 > 'A' 字符 < 'Z' 则是大写字母
      if (c >= 'A' && c <= 'Z') {
        bigCount++;
      } else if (c >= 'a' && c <= 'z') {// 5.判断小写字母：字符 > 'a' 字符 < 'z' 则是小写字母
        smallCount++;
      } else if (c >= '0' && c <= '9') {// 6.判断数字：字符 > '0' 字符 < '9' 则是数字
        numCount++;
      } else {// 非法字符
        System.out.println("非法字符：" + c);
      }
    }
    System.out.println("大写字符：" + bigCount + "个");
    System.out.println("小写字符：" + smallCount + "个");
    System.out.println("数字字符：" + numCount + "个");
  }
}
