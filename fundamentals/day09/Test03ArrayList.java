import java.util.ArrayList;

public class Test03ArrayList {
  public static void main(String[] args) {
    // 1.创建集合对象
    ArrayList<String> list = new ArrayList<>();
    // 2.往集合中添加3个字符串：凡人修仙、斗破苍穹、斗罗大陆
    list.add("凡人修仙");
    list.add("斗破苍穹");
    list.add("斗罗大陆");
    // 3.遍历集合：for循环n结构for(int i = 0 ; i < ? ; i++ ){...}
    // 获取集合长度size()
    // 使用get(index)方式获取每个元素
    for (int i = 0; i < list.size(); i++) {
      String element = list.get(i);
      System.out.println("element = " + element);
    }
  }
}
