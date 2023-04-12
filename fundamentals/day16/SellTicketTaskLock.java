import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicketTaskLock implements Runnable {
  // 电影票
  private int tickets = 100;
  // Lock锁接口实现类
  private Lock lock = new ReentrantLock();

  /*
   * 每个窗口执行相同的卖票操作
   * 窗口永远开启，所有窗口卖完100张票为止
   */
  @Override
  public void run() {
    while (true) {
      lock.lock();// 加同步锁
      // 有票 可以卖
      if (tickets > 0) {
        // 模拟出票时间：使用sleep模拟一下出票时间
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        // 获取当前线程对象的名字
        String name = Thread.currentThread().getName();
        System.out.println(name + "-正在卖:" + tickets--);
      }
      // 释放同步锁
      lock.unlock();
    }
  }
}
