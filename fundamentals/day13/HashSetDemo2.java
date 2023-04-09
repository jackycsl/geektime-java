import java.util.HashSet;

public class HashSetDemo2 {
  public static void main(String[] args) {
    // 创建集合对象 该集合中存储 Student类型对象
    HashSet<StudentHash> stuSet = new HashSet<StudentHash>();
    // 存储
    StudentHash stu = new StudentHash("宝儿姐", 43);
    stuSet.add(stu);
    stuSet.add(new StudentHash("大鹏", 44));
    stuSet.add(new StudentHash("宝儿姐", 43));
    stuSet.add(new StudentHash("雄哥", 23));
    stuSet.add(stu);

    for (StudentHash stu2 : stuSet) {
      System.out.println(stu2);
    }
  }
}
