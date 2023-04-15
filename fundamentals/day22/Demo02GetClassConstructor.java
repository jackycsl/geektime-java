import java.lang.reflect.Constructor;

public class Demo02GetClassConstructor {
  public static void main(String[] args) throws Exception {
    // 获取类的构造方法对象，并通过运行构造方法获取对象
    Class<?> c1 = Class.forName("Student");
    // 获取有参数构造方法
    Constructor<?> c2 = c1.getConstructor(String.class, int.class);
    Object o2 = c2.newInstance("冰墩墩", 12);
    Student s2 = (Student) o2;
    System.out.println("s2 = " + s2);// Student{name='冰墩墩', age=12}
  }
}
