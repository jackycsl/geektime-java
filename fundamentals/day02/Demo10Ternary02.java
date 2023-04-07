public class Demo10Ternary02 {
  public static void main(String[] args) {
    // 1:定义三个变量用于保存和尚的身高，单位为cm，这里仅仅体现数值即可。
    int h1 = 150;
    int h2 = 210;
    int h3 = 165;
    // 2:用三元运算符获取前两个和尚的较高身高值，并用临时身高变量保存起来。
    int temp = h2 > h1 ? h2 : h1;
    // 3:用三元运算符获取临时身高值和第三个和尚身高较高值，并用最大身高变量保存。
    int max = temp > h3 ? temp : h3;
    // 4:输出结果
    System.out.println("这三个和尚中身高最高的是:" + max + "cm");
  }
}
