public class Demo02continue {
  public static void main(String[] args) {
    // 循环结束

    for (int i = 1; i <= 10; i++) {
      if (i % 5 == 0) {
        continue;
      }
      System.out.println("HelloWorld" + i);
    }

    // 循环结束
    System.out.println("loop end");
  }

}
