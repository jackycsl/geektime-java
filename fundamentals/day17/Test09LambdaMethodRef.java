public class Test09LambdaMethodRef {
  public static void main(String[] args) {
    hireSitter(Cook::makeFood);// 方法引用
  }

  // 雇佣一个保姆，并且让他去做饭
  public static void hireSitter(Sitter sitter) {
    sitter.work("白菜");
  }
}
