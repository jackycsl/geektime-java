public class Demo03ParamMethod {
  public static void main(String[] args) {
    methodOne(100);
    methodTwo(100, 200, 300);
  }

  public static void methodOne(int number) {
    System.out.println(number);
  }

  public static void methodTwo(int n1, int n2, int n3) {
    System.out.println(n1 + n2 + n3);
  }
}
