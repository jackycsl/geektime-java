public class Test11 {
  public static void main(String[] args) {
    // 1.调用method1()方法，可以传入一个Student对象，也可以传入一个Teacher对象
    method1(new Student11());// OK的
    method1(new Teacher11());// OK的

    // 2.调用method2()方法，接收的可能是Student对象，也可能是Teacher对象
    // 所以，这里使用Person类型接收
    Person11 p = method2();
    p.work();// 如果是Student对象，则调用的是Student的work()；如果是Teacher对象，调用的是Teacher的work()。
  }

  // -------------------------------------------------------------------------------//
  // 抽象类Person作为形参——可以接收任何它的子类对象
  public static void method1(Person11 p) {
    p.eat();
    p.work();
  }

  // 抽象类Person作为返回值——此方法可以返回一个Student对象，也可以返回一个Teacher对象
  public static Person11 method2() {
    // return new Student();//OK的
    return new Teacher11();// OK的
  }
}
