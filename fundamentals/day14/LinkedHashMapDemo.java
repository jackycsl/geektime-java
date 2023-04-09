import java.util.LinkedHashMap;
import java.util.Set;
// import java.util.Map.Entry;
import java.util.Map.Entry;

public class LinkedHashMapDemo {
  public static void main(String[] args) {
    LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
    map.put("邓超", "孙俪");
    map.put("李晨", "范冰冰");
    map.put("刘德华", "朱丽倩");
    Set<Entry<String, String>> entrySet = map.entrySet();
    for (Entry<String, String> entry : entrySet) {
      System.out.println(entry.getKey() + "  " + entry.getValue());
    }
  }
}
