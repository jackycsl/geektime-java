import java.lang.reflect.Method;

public class Demo03GetClassMethod {
  public static void main(String[] args) throws Exception {
    // 反射获取目标类的字节码对象，并执行其成员方法
    Class<?> c1 = Class.forName("Student");
    Object obj = c1.newInstance();

    // 反射获取有参数方法：Student的eat方法
    Method eatMethod = c1.getMethod("eat", String.class, double.class);
    // 调用eat方法，传递实际参数
    eatMethod.invoke(obj, "西红柿炒鸡蛋", 9.9);
  }
}
