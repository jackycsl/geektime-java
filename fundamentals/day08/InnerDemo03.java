public class InnerDemo03 {
  public static void main(String[] args) {
    /*
     * 1.等号右边:定义并创建该接口的子类对象
     * 2.等号左边:是多态,接口类型引用指向子类对象
     */
    FlyAble f = new FlyAble() {
      public void fly() {
        System.out.println("我真的真的要飞了~~~");
      }
    };
    // 将f传递给showFly方法中
    showFly(f);
  }

  public static void showFly(FlyAble f) {
    f.fly();
  }
}
