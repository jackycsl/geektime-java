public class Demo05Override {
  // 数据类型不同
  public static void fnOne(int a) {
  }

  public static void fnOne(double a) {
  }

  // 参数个数不同
  public static void fnTwo(int a) {
  }

  public static void fnTwo(int a, int b) {
  }

  // 参数顺序不同
  public static void fnThree(int a, double b) {
  }

  public static void fnThree(double b, int a) {
  }

  // 与返回值无关，与修饰符无关
  // public static void fnFour(int a) {
  // }

  // public static int fnFour(int a) {
  // return 1;
  // }
}
