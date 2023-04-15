public class Demo01GetClassObject {
  public static void main(String[] args) throws ClassNotFoundException {
    // 常规：创建类的对象，编译期 --> 运行时
    Student s = new Student();
    System.out.println("s = " + s);
    // 获取类的字节码对象
    Class<? extends Student> c1 = s.getClass();
    Class<Student> c2 = Student.class;
    System.out.println("c1 = " + c1);// class com.abc.clazz.Student
    System.out.println("c2 = " + c2);// class com.abc.clazz.Student
    // 运行时，通过Class类创建Student类的字节码对象
    Class<?> c3 = Class.forName("Student");
    System.out.println("c3 = " + c3);// class com.abc.clazz.Student
  }
}
