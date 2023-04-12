public class Demo03MainThreadName {
  public static void main(String[] args) {
    // 获取当前线程对象
    Thread t = Thread.currentThread();
    // 获取当前线程对象名称
    System.out.println(t.getName());
  }
}
