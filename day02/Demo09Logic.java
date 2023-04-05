public class Demo09Logic {
  public static void main(String[] args) {
    int x = 3;
    int y = 4;
    System.out.println((x++ > 4) & (y++ > 5)); // 两个表达都会运算
    System.out.println(x); // 4
    System.out.println(y); // 5

    System.out.println((x++ > 4) && (y++ > 5)); // 左边已经可以确定结果为false，右边不参与运算
    System.out.println(x); // 4
    System.out.println(y); // 4
  }
}
