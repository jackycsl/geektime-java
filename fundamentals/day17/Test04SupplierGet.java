import java.util.function.Supplier;

public class Test04SupplierGet {
  public static void main(String[] args) {
    String msgA = "Hello";
    String msgB = "World";
    String str = getStr(() -> msgA + msgB);
    System.out.println("str = " + str);//
  }

  private static String getStr(Supplier<String> func) {
    return func.get();
  }
}
