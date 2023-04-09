import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ListMapDemo {
  public static void main(String[] args) {

    Map<String, String> map1 = new HashMap<>();
    map1.put("c001", "迪丽热巴");
    map1.put("c002", "古力娜扎");

    Map<String, String> map2 = new HashMap<>();
    map2.put("h001", "蔡徐坤");
    map2.put("h002", "李易峰");

    // 将两个班的map存储到一个ArrayList中
    ArrayList<Map<String, String>> allList = new ArrayList<>();
    allList.add(map1);
    allList.add(map2);

    // 遍历allList，取出每个Map
    for (Map<String, String> map : allList) {
      // 遍历map
      Set<String> keys = map.keySet();
      for (String key : keys) {
        System.out.println(key + " - " + map.get(key));
      }
    }
  }
}
