import java.util.function.Predicate;

public class Test07Predicate {
  public static void main(String[] args) {
    // 判断字符串是否很长
    method(s -> s.length() > 5, "Hello World!");
  }

  // 定义函数式接口参数
  private static void method(Predicate<String> predicate, String str) {
    boolean result = predicate.test(str);
    System.out.println("字符串很长吗 : " + result);
  }
}
