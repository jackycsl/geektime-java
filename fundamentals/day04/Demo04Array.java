public class Demo04Array {
  public static void main(String[] args) {
    int[] arr = new int[3];
    // 输出数组名
    System.out.println(arr);
    // [I@880ec60
    // 输出数组中的元素
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    arr[0] = 100;
    arr[1] = 200;

    System.out.println(arr);
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
  }
}
