import java.util.stream.Stream;

public class Test16StreamNormalMethod {
  public static void main(String[] args) {
    Stream<String> stream = Stream.of("大娃", "二娃", "三娃", "四娃", "五娃", "六娃", "七娃", "爷爷", "蛇精", "蝎子精");
    // forEach方法，终结方法，作用：逐一进行处理
    stream.forEach(s -> System.out.println(s));
  }
}
