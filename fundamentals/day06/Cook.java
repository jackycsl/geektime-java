// 定义一个子类继承抽象类
class Cook extends Employee {
  public Cook() {
  }

  public Cook(String id, String name, double salary) {
    super(id, name, salary);
  }

  @Override
  public void work() {
    System.out.println("厨师炒菜多加点盐...");
  }
}
