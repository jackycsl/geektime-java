public class TestUSB {
  public static void main(String[] args) {
    // 1.调用method1()方法，需要传入USB的任何子类对象都可以
    method1(new Keyboard());
    method1(new Mouse());

    // 2.调用method2()方法，此方法可能返回一个Keyboard对象，也可能返回一个Mouse对象
    USB usb = method2();
    usb.run();
  }

  // 接口作为形参
  public static void method1(USB usb) {
    usb.run();
  }

  // 接口作为返回值
  public static USB method2() {
    // return new Keyboard();//OK的
    return new Mouse();// OK的
  }
}
