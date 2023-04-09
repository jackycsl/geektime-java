import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String[] args) {
    // 有参构造,传入比较器,使用比较器对元素进行排序
    TreeSet<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        // 元素前 - 元素后 : 升序
        // 元素后 - 元素前 : 降序
        return o2 - o1;
      }
    });

    set.add(20);
    set.add(18);
    set.add(23);
    set.add(22);
    set.add(17);
    set.add(24);
    set.add(19);
    System.out.println(set);
  }
}
