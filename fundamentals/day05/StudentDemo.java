/*
    创建对象并为其成员变量赋值的两种方式
        1:无参构造方法创建对象后使用setXxx()赋值
        2:使用带参构造方法直接创建带有属性值的对象
*/
public class StudentDemo {
  public static void main(String[] args) {
    // 无参构造方法创建对象后使用setXxx()赋值
    Studen05 s1 = new Studen05();
    s1.setName("雄哥");
    s1.setAge(30);
    s1.show();

    // 使用带参构造方法直接创建带有属性值的对象
    Studen05 s2 = new Studen05("雄哥", 30);
    s2.show();
  }
}
