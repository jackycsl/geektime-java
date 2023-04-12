import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.Arrays;

public class Demo11ThreadPool {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    // 创建有2个线程的线程池
    ExecutorService es = Executors.newFixedThreadPool(2);
    // 提交执行任务：切割字符串，求100个数字的和
    Future<String[]> fuStr = es.submit(new MyStrCallable("aa bb  cc   dd    e"));
    Future<Integer> fuInt = es.submit(new MySumCallable());
    // 打印结果
    System.out.println("切割字符串：" + Arrays.toString(fuStr.get()));
    System.out.println("100个数字和：" + fuInt.get());
    // 关闭资源
    es.shutdown();
  }
}
