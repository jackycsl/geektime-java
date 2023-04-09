import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Student13Demo {
  public static void main(String[] args) {
    // 创建四个学生对象 存储到集合中
    ArrayList<Student13> list = new ArrayList<Student13>();

    list.add(new Student13("rose", 18));
    list.add(new Student13("jack", 16));
    list.add(new Student13("vincen", 20));
    Collections.sort(list, new Comparator<Student13>() {
      @Override
      public int compare(Student13 o1, Student13 o2) {
        return o1.getAge() - o2.getAge();// 以学生的年龄升序
      }
    });

    for (Student13 student : list) {
      System.out.println(student.getName());
    }
  }
}
