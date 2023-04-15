public class Student {
  private String name;
  private int age;
  public Student(){
  }
  public Student(String name,int age) {
      this.name = name;
      this.age = age;
  }
  public void study(){
      System.out.println("学生在学习");
  }

  public void eat(String s,double d){
      System.out.println("带参数方法:"+s+"::"+d);
  }
  public String toString() {
      return "Student{" +
              "name='" + name + '\'' +
              ", age=" + age +
              '}';
  }
}
