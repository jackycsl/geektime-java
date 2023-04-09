import java.util.Comparator;
import java.util.TreeMap;

public class StudentTreeMapDemo {
  public static void main(String[] args) {
    TreeMap<StudentTreeMap, String> map = new TreeMap<StudentTreeMap, String>(new Comparator<StudentTreeMap>() {
      @Override
      public int compare(StudentTreeMap o1, StudentTreeMap o2) {
        // 先按照年龄升序
        int result = o1.getAge() - o2.getAge();
        if (result == 0) {
          // 年龄相同,则按照名字的首字母升序
          return o1.getName().charAt(0) - o2.getName().charAt(0);
        } else {
          // 年龄不同,直接返回结果
          return result;
        }
      }
    });
    map.put(new StudentTreeMap(30, "jack"), "深圳");
    map.put(new StudentTreeMap(10, "rose"), "北京");
    map.put(new StudentTreeMap(20, "tom"), "上海");
    map.put(new StudentTreeMap(10, "marry"), "南京");
    map.put(new StudentTreeMap(30, "lucy"), "广州");
    System.out.println(map);
  }
}
