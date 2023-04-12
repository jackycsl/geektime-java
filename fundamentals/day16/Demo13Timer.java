import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
    定时器案例：每隔3秒打印系统时间
 */
public class Demo13Timer {
  public static void main(String[] args) {
    // 创建定时器
    Timer timer = new Timer();
    // 定义定时任务
    TimerTask timertask = new TimerTask() {
      @Override
      public void run() {
        System.out.println("时间：" + new Date());
      }
    };
    /*
     * 设置定时任务
     * 参数1：任务线程
     * 参数2：开始执行时间
     * 参数3：时间间隔
     */
    timer.schedule(timertask, new Date(), 3000);
  }
}
