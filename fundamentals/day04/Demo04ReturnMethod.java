public class Demo04ReturnMethod {
  public static void main(String[] args) {
    // 调用带返回值方法
    methodOne(1, 2);
    // 赋值调用
    int c = methodOne(2, 3);
    System.out.println(c);
    // 打印调用
    System.out.println(methodOne(3, 4));
  }

  // 定义带返回值的方法
  public static int methodOne(int a, int b) {
    return a + b;
  }
}
