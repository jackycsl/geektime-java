public class Test01Lambda {
  public static void main(String[] args) {
    // 匿名内部类写法
    Runnable r = new Runnable() {
      @Override
      public void run() {
        System.out.println("多线程任务执行！");
      }
    };
    new Thread(r).start();
    // Lambda写法
    new Thread(() -> System.out.println("多线程执行任务！")).start();
    // 从代码的语义中可以看出：启动一个线程，而线程任务的内容以一种更加简洁的形式被指定。
  }
}
