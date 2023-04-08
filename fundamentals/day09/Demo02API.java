import java.util.Scanner;

/*
    练习1：获取键盘录入的字符串
    分析思路：
        1.根据需求查找API帮助文档，在索引输入框搜索Scanner
        2.看包：
            java.lang包下的类不需要导包，其他的包需要导入
        3.看类和类的概述
        4.学习构造方法
        5.使用成员方法
        6.获取关键信息：导包【2】 --> 创建键盘录入工具对象【4】 --> 调用方法获取录入字符串【5】
        7.打印字符串
 */
public class Demo02API {
  public static void main(String[] args) {
    // 创建键盘录入工具对象
    Scanner sc = new Scanner(System.in);
    // 调用方法获取录入字符串
    String line = sc.nextLine();
    // 打印字符串
    System.out.println("line = " + line);
  }
}
