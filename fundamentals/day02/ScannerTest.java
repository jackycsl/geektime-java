import java.util.Scanner;

public class ScannerTest {
  public static void main(String[] args) {
    // 身高采用键盘录入实现。首先导包，然后创建对象。
    Scanner sc = new Scanner(System.in);
    // 键盘录入三个身高分别赋值给三个变量。
    System.out.println("请输入第一个和尚的身高:");
    int h1 = sc.nextInt();
    System.out.println("请输入第二个和尚的身高:");
    int h2 = sc.nextInt();
    System.out.println("请输入第三个和尚的身高:");
    int h3 = sc.nextInt();
    // 用三元运算符获取前两个和尚的较高身高值，并用临时身高变量保存起来。
    int temp = h1 > h2 ? h1 : h2;
    // 用三元运算符获取临时身高值和第三个和尚身高较高值，并用最大身高变量保存。
    int max = temp > h3 ? temp : h3;
    // 输出结果。
    System.out.println("这三个和尚中身高最高的是:" + max + "cm");
  }
}
