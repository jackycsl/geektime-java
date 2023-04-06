/*
    数组常见两个小问题：
        1.数组索引越界异常：出现原因，访问超过数组长度的索引。错误提示ArrayIndexOutOfBoundsException
        2.空指针异常：出现原因，访问的数组没有指向具体数组地址。错误提示NullPointerException
 */
public class Demo09ArrayBugs {
  public static void main(String[] args) {
    // 数组角标越界
    // int[] arr = new int[3];
    // System.out.println(arr[3]);

    // 空指针异常
    int[] arr2 = new int[3];
    arr2 = null;
    System.out.println(arr2[0]);
  }
}
