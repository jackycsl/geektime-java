import java.util.Arrays;

public class Test03Lambda {
  public static void main(String[] args) {
    // 乱序数组对象数组
    Person17[] ps = {
        new Person17("冰墩墩", 2),
        new Person17("谷爱玲", 18),
        new Person17("雪融融", 3) };

    System.out.println("---------------排序前-----------------");
    for (Person17 p : ps) {
      System.out.println("p = " + p);
    }
    // 排序：使用Lambda写法
    Arrays.sort(ps, (Person17 p1, Person17 p2) -> {
      return p1.getAge() - p2.getAge();
    });
    // 打印对象数组
    System.out.println("---------------排序后-----------------");
    for (Person17 p : ps) {
      System.out.println("p = " + p);
    }
  }
}
