public class Demo04Implements {
  public static void main(String[] args) {
    // 创建自定义类对象 线程任务对象
    MyRunnable mr = new MyRunnable();
    // 创建线程对象
    Thread t = new Thread(mr);
    t.start();
    for (int i = 0; i < 20; i++) {
      System.out.println("main " + i);
    }
  }
}
