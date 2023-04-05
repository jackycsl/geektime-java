public class Demo07Relation {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.println(a == b); // false
    System.out.println(a != b); // true
    System.out.println(a > b); // false
    System.out.println(a >= b); // false
    System.out.println(a < b); // true
    System.out.println(a <= b); // true
    // 关系运算的结果肯定是boolean类型，所以也可以将运算结果赋值给boolean类型的变量
    boolean flag = a > b;
    System.out.println(flag); // 输出false
  }
}
