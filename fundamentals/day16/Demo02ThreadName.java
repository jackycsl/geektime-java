public class Demo02ThreadName {
  public static void main(String[] args) {
    // 创建自定义线程对象
    MyThreadName mt = new MyThreadName();
    // 设置线程名字
    mt.setName("冰墩墩");
    // 开启新线程
    mt.start();
  }
}
