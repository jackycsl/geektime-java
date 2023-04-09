import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMapDemo {
  public static void main(String[] args) {

    Map<String, String> map1 = new HashMap<>();
    map1.put("c001", "迪丽热巴");
    map1.put("c002", "古力娜扎");

    Map<String, String> map2 = new HashMap<>();
    map2.put("h001", "蔡徐坤");
    map2.put("h002", "李易峰");

    // 将两个班的Map连同对应的"班号"一同存储在一个Map中
    Map<String, Map<String, String>> allMap = new HashMap<>();
    allMap.put("11", map1);
    allMap.put("22", map2);

    // 遍历allMap
    Set<String> keys = allMap.keySet();
    for (String k : keys) {
      System.out.println(k + "：");
      // 取出对应的map
      Map<String, String> map = allMap.get(k);
      // 遍历map
      Set<String> keys2 = map.keySet();
      for (String k2 : keys2) {
        System.out.println(k2 + " = " + map.get(k2));
      }
    }
  }
}
