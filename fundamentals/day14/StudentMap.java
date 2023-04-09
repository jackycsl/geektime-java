import java.util.Objects;

public class StudentMap {
  private String name;
  private int age;

  public StudentMap(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // 构造方法
  // get/set
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    StudentMap student = (StudentMap) o;
    return age == student.age && Objects.equals(name, student.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }
}
