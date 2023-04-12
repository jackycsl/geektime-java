import java.util.function.Consumer;

public class Test05Consumer {
  public static void main(String[] args) {
    consumerStr(s -> System.out.println(s), "Hello World");
  }

  // 定义函数式接口参数
  private static void consumerStr(Consumer<String> func, String str) {
    func.accept(str);
  }
}
