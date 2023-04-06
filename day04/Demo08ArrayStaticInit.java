/*
    数组动态初始化：在数组创建时，不指定数组内的元素。
    数组静态化：在创建数组时，直接指定数组内元素的值。

    格式：
        完整格式：数据类型[] 变量名 = new 数据类型[]{元素1，元素2，元素3...}
        简化格式：数据类型[] 变量名 = {}
 */
public class Demo08ArrayStaticInit {
  public static void main(String[] args) {
    // 定义数组、输出数组名称和数组中的元素
    int[] arr = new int[] { 1, 2, 3 };
    int[] arr2 = { 3, 4, 5, 6 };

    System.out.println(arr);
    System.out.println(arr2);

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
  }
}
