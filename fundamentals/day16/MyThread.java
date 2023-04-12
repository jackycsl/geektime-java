public class MyThread extends Thread {
  /*
   * 重写run方法，完成该线程执行的逻辑
   */
  @Override
  public void run() {
    for (int i = 0; i < 200; i++) {
      System.out.println("自定义线程正在执行！" + i);
    }
  }
}
