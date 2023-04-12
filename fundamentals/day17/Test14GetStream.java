import java.util.stream.Stream;

public class Test14GetStream {
  public static void main(String[] args) {
    // 第二种方式：`Stream`接口的静态方法`of`可以获取数组对应的流。
    String[] arr = { "冰蹲蹲", "雪融融", "谷爱凌", "羽生结玄" };
    Stream<String> stringStream = Stream.of(arr);
  }
}
