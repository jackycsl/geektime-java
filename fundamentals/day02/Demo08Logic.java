public class Demo08Logic {
  public static void main(String[] args) {
    // 定义变量
    int i = 10;
    int j = 20;
    int k = 30;

    // & “与”，并且的关系，只要表达式中有一个值为false，结果即为false
    System.out.println((i > j) & (i > k)); // false & false,输出false
    System.out.println((i < j) & (i > k)); // true & false,输出false
    System.out.println((i > j) & (i < k)); // false & true,输出false
    // | “或”，或者的关系，只要表达式中有一个值为true，结果即为true
    System.out.println((i > j) | (i > k)); // false | false,输出false
    System.out.println((i < j) | (i > k)); // true | false,输出true
    System.out.println((i > j) | (i < k)); // false | true,输出true
    System.out.println((i < j) | (i < k)); // true | true,输出true
    System.out.println("--------");

    // ^ “异或”，相同为false，不同为true
    System.out.println((i > j) ^ (i > k)); // false ^ false,输出false
    System.out.println((i < j) ^ (i > k)); // true ^ false,输出true
    System.out.println((i > j) ^ (i < k)); // false ^ true,输出true
    System.out.println((i < j) ^ (i < k)); // true ^ true,输出false
    System.out.println("--------");

    // ! “非”，取反
    System.out.println((i > j)); // false
    System.out.println(!(i > j)); // !false，,输出true
  }
}
