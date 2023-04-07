public class Demo08while {
  public static void main(String[] args) {
    // 需求:在控制台输出5次"HelloWorld"
    // for循环实现
    for (int i = 1; i <= 5; i++) {
      System.out.println("HelloWorld");
    }
    System.out.println("--------");
    // while循环实现
    int j = 1;
    while (j <= 5) {
      System.out.println("HelloWorld");
      j++;
    }
  }
}
