import java.util.function.Function;

public class Test06Function {
  public static void main(String[] args) {
    stringToInt(s -> Integer.parseInt(s), "10");
  }

  // 定义函数式接口参数
  private static void stringToInt(Function<String, Integer> function, String str) {
    int num = function.apply(str);
    System.out.println("num = " + num);
  }
}
