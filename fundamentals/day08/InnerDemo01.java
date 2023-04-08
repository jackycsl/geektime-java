public class InnerDemo01 {
  public static void main(String[] args) {
    /*
     * 1.等号右边:定义并创建该接口的子类对象
     * 2.等号左边:是多态,接口类型引用指向子类对象
     */
    FlyAble f = new FlyAble() {
      public void fly() {
        System.out.println("我飞了~~~");
      }
    };
    f.fly();
  }
}
