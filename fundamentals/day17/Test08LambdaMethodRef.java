public class Test08LambdaMethodRef {
  public static void main(String[] args) {
    hireSitter(food -> System.out.println("将" + food + "做成可口的食物。"));
  }

  // 雇佣一个保姆，并且让他去做饭
  public static void hireSitter(Sitter sitter) {
    sitter.work("白菜");
  }
}
