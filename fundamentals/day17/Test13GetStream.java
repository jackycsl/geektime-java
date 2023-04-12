import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Test13GetStream {
  public static void main(String[] args) {
    // 第一种方式：所有的`Collection`集合都可以通过`stream`默认方法获取流；
    List<String> list = new ArrayList<>();
    Stream<String> stream = list.stream();
    Set<String> set = new HashSet<>();
    Stream<String> stream2 = set.stream();
  }
}
