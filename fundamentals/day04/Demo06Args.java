public class Demo06Args {
  public static void main(String[] args) {
    // 基本数据类型传参的特点：基本数据类型传参，形式参数改变不影响实际参数
    // 结论依据：每个方法在栈内存中，都会有独立的栈空间，方法运行结束后就会弹栈消失，内存会被释放掉。
    int number = 100;
    System.out.println("调用change方法前：" + number);
    change(number);
    System.out.println("调用change方法后：" + number);
  }

  public static void change(int num) {
    num = 200;
  }
}
