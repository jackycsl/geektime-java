import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.Map;

public class Demo11ConcurrentHashMap {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    // 创建线程安全的集合
    Map<String, Integer> map = new ConcurrentHashMap<String, Integer>();
    // 创建线程不安全的集合
    // Map<String,Integer> map = new HashMap<String, Integer>();
    // 存储2000个键值对
    for (int x = 0; x < 2000; x++) {
      map.put("count" + x, x);
    }
    // 开启线程，删除前500个
    Runnable r1 = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 500; i++) {
          map.remove("count" + i);
        }
      }
    };
    // 开启线程，删除1000-1500个
    Runnable r2 = new Runnable() {
      @Override
      public void run() {
        for (int i = 1000; i < 1500; i++) {
          map.remove("count" + i);
        }
      }
    };
    new Thread(r1).start();
    new Thread(r2).start();
    // 等待2秒，让2个线程全部运行完毕
    Thread.sleep(2000);
    // 打印集合长度，线程安全集合应该是1000，线程不安全则大概率不是1000，因为两个线程并发移出元素操作线程不安全，会出现资源争抢导致移出操作有概率不能完成
    System.out.println(map.size());
  }
}
