import java.util.ArrayList;

public class Demo01ArrayList {
  public static void main(String[] args) {
    // 创建集合：1.使用泛型，2.不使用泛型
    ArrayList list1 = new ArrayList();
    ArrayList<String> list2 = new ArrayList<String>();
    // 常用方法
    // add(E e)：将指定的元素追加到此集合的末尾
    list2.add("hello");
    list2.add("world");
    list2.add("java");
    list2.add("牛逼");
    // remove(Object o)：删除指定的元素，返回删除是否成功
    list2.remove("java");
    // remove(int index)：删除指定索引处的元素，返回被删除的元素
    list2.remove(0);// 计算机计数从0开始
    // set(int index,E element)：修改指定索引处的元素，返回被修改的元素
    list2.set(1, "Python");
    // get(int index)：返回指定索引处的元素
    String indexOne = list2.get(1);
    System.out.println(indexOne);
    // size()：返回集合中的元素的个数
    int size = list2.size();

    System.out.println("size = " + size);
    // 特点：
    // 1.动态扩容
    // 2.允许元素为null
    list1.add(null);
    // 3.添加任意类型
    list1.add("abc");
    list1.add(1.1);
    list1.add(2000);
    list1.add(true);
    System.out.println("list1 = " + list1);
  }
}
