// 定义一个子类继承抽象类
class Cook05 extends Employee {
  public Cook05() {
  }

  public Cook05(String id, String name, double salary) {
    super(id, name, salary);
  }

  @Override
  public void work() {
    System.out.println("厨师炒菜多加点盐...");
  }
}
