import java.util.ArrayList;
import java.util.Collection;

public class NBForDemo1 {
  public static void main(String[] args) {
    int[] arr = { 3, 5, 6, 87 };
    // 使用增强for遍历数组
    for (int a : arr) {// a代表数组中的每个元素
      System.out.println(a);
    }

    Collection<String> coll = new ArrayList<String>();
    coll.add("小河神");
    coll.add("老河神");
    coll.add("神婆");

    for (String s : coll) {
      System.out.println(s);
    }
  }
}
