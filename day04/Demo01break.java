public class Demo01break {
  public static void main(String[] args) {
    // for循环
    for (int i = 1; i <= 10; i++) {
      if (i % 5 == 0) {
        break;
      }
      System.out.println("HelloWorld" + i);
    }
    // 循环结束
    System.out.println("loop end");
  }
}
