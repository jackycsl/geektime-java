public class AutoChange {
  public static void main(String[] args) {
    int i = 1;
    byte b = 2;
    // byte x = b + i; // 报错
    // int类型和byte类型运算，结果是int类型
    int j = b + i;
    System.out.println(j);
  }
}
