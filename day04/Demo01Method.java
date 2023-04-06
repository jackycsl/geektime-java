public class Demo01Method {
  public static void main(String[] args) {
    methodThree();
    String s = methodFour();
    System.out.println(s);
  }

  public static void methodThree() {
    System.out.println("老三-沙僧");
  }

  public static String methodFour() {
    return "老四-白龙马";
  }
}
