public class InnerDemo02 {
  public static void main(String[] args) {
    /*
     * 创建匿名内部类,直接传递给showFly(FlyAble f)
     */
    showFly(new FlyAble() {
      public void fly() {
        System.out.println("我飞起来了~~~");
      }
    });
  }

  public static void showFly(FlyAble f) {
    f.fly();
  }
}
