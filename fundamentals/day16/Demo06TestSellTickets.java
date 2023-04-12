public class Demo06TestSellTickets {
  public static void main(String[] args) {
    // 创建线程任务对象
    SellTicketTask task = new SellTicketTask();
    // 创建三个窗口对象
    Thread t1 = new Thread(task, "窗口1");
    Thread t2 = new Thread(task, "窗口2");
    Thread t3 = new Thread(task, "窗口3");

    // 同时卖票
    t1.start();
    t2.start();
    t3.start();
  }
}
