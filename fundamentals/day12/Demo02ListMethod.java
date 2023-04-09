import java.util.ArrayList;
import java.util.List;

public class Demo02ListMethod {
  public static void main(String[] args) {
    method4();
  }

  public static void method4() {
    // 创建集合
    List<String> list = new ArrayList<>();
    // 添加元素
    list.add("jack");
    list.add("rose");
    list.add("tony");
    // 打印集合
    System.out.println("替换前：" + list); // [jack, rose, tony]
    // 调用set方法，使用 tom 替换掉原来索引为1的元素
    String str = list.set(1, "tom");
    System.out.println("替换后：" + list); // [jack, tom, tony]
    System.out.println("str:" + str); // rose
  }

  public static void method3() {
    // 创建集合
    List<String> list = new ArrayList<>();
    // 添加元素
    list.add("jack");
    list.add("rose");
    list.add("tony");
    // 打印集合
    System.out.println("删除前：" + list); // [jack, rose, tony]
    // 调用remove方法，删除索引为1的元素
    String str = list.remove(1);
    System.out.println("删除后：" + list); // [jack, tony]
    System.out.println("str:" + str); // rose
  }

  public static void method2() {
    // 创建集合
    List<String> list = new ArrayList<>();
    // 添加元素
    list.add("jack");
    list.add("rose");
    list.add("tony");
    // 调用get方法，根据索引获取元素
    System.out.println(list.get(1));
  }

  public static void method1() {
    // 创建集合
    List<String> list = new ArrayList<>();
    // 添加元素
    list.add("jack");
    list.add("rose");
    list.add("tony");
    // 打印集合
    System.out.println("list:" + list); // [jack, rose, tony]
    // 向索引为1的位置插入元素。 lucy
    list.add(1, "lucy");
    // 打印集合
    System.out.println("list:" + list); // [jack, lucy, rose, tony]

  }
}
