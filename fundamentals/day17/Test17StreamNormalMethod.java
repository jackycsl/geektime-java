import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test17StreamNormalMethod {
  public static void main(String[] args) {
    Stream<String> stream = Stream.of("大娃", "二娃", "三娃", "四娃", "五娃", "六娃", "七娃", "爷爷", "蛇精", "蝎子精");
    // forEach方法，终结方法，作用：逐一进行处理
    // stream.forEach(s -> System.out.println(s));一个流只能终结一次
    // filter方法，作用：过滤
    Stream<String> stream1 = stream.filter(s -> s.endsWith("娃"));
    stream1.forEach(s -> System.out.println(s));

    // count方法，作用：统计个数
    long waCount = stream.filter(s -> s.endsWith("娃")).count();
    System.out.println("有几个葫芦娃 = " + waCount);

    // limit方法，作用：取用前几个
    stream.limit(3).forEach(s -> System.out.println(s));

    // skip方法，作用：跳过前几个
    stream.skip(3).forEach(s -> System.out.println(s));

    // concat方法，作用：组合
    Stream<String> stream2 = Stream.of("雪融融", "冰墩墩");
    Stream<String> streamConcat = Stream.concat(stream, stream2);
    streamConcat.forEach(s -> System.out.println(s));

    // collect方法，作用：流转集合
    Set<String> set = stream.collect(Collectors.toSet());
    for (String s : set) {
      System.out.println(s);
    }
  }
}
