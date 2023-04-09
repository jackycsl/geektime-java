import java.util.Objects;

public class StudentHash {
  private String name;
  private int age;

  StudentHash(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // get/set
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    StudentHash student = (StudentHash) o;
    return age == student.age &&
        Objects.equals(name, student.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }
}
