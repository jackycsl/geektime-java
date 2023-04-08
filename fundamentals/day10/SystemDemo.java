
//验证for循环打印数字1-9999所需要使用的时间（毫秒）
public class SystemDemo {
  public static void main(String[] args) {
    // 获取当前时间毫秒值
    System.out.println(System.currentTimeMillis());
    // 计算程序运行时间
    long start = System.currentTimeMillis();
    for (int i = 1; i <= 10000; i++) {
      System.out.println(i);
    }
    long end = System.currentTimeMillis();
    System.out.println("共耗时毫秒：" + (end - start));
  }
}
