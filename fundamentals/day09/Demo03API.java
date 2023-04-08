import java.util.Random;

/*
    练习2：获取一个1-33之间（包含1和33）的随机数字
    分析思路：
        1.根据需求查找API帮助文档，在索引搜索框中搜索Random
        2.看包：
        3.看类和类的概述
        4.学习构造方法
        5.使用成员方法
        6.获取关键信息：导包 --> 创建工具对象 --> 调用方法获取获取随机数
        7.输出数据
 */
public class Demo03API {
  public static void main(String[] args) {
    // 创建工具对象
    Random r = new Random();
    // 调用方法获取获取随机数
    int randomNum = r.nextInt(33);
    // 返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值。
    // 范围：【0,n-1】
    // 输出数据
    System.out.println("randomNum:" + (randomNum + 1));
  }
}
