import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
  public static void main(String[] args) {
    // 1,创建Hashmap集合对象。
    Map<StudentMap, String> map = new HashMap<StudentMap, String>();
    // 2,添加元素。
    map.put(new StudentMap("lisi", 28), "上海");
    map.put(new StudentMap("wangwu", 22), "北京");
    map.put(new StudentMap("wangwu", 22), "南京");

    // 3,取出元素。键找值方式
    Set<StudentMap> keySet = map.keySet();
    for (StudentMap key : keySet) {
      String value = map.get(key);
      System.out.println(key.toString() + "....." + value);
    }
  }
}
