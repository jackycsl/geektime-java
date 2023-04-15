public class Demo03GetClassConstructor {
  public static void main(String[] args) throws Exception {
    // 获取类的构造方法对象，并通过运行构造方法获取对象
    Class<?> c1 = Class.forName("Student");
    Object o3 = c1.newInstance();
    Student s3 = (Student) o3;
    System.out.println("s3 = " + s3);
  }
}
