public class Demo07Args {
  public static void main(String[] args) {
    // 引用数据类型传参的特点：引用类型作为方法参数，形式参数改变会影响实际参数
    // 结论依据：引用数据类型的传参，传的是引用的地址值。因此，内存中会出现两个引用地址指向同一片内存区域效果。
    // 所以方法弹栈，堆内存数据并不会消失。change修改的数据在main方法中也可以读到。
    int[] arr = { 10, 20, 30 };
    System.out.println("调用change方法前：" + arr[1]);
    change(arr);
    System.out.println("调用change方法后：" + arr[1]);
  }

  public static void change(int[] arr) {
    arr[1] = 50;
  }
}
