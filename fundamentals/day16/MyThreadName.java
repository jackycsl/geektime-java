public class MyThreadName extends Thread {
  public void run() {
    System.out.println("线程名字:" + super.getName());
  }
}
