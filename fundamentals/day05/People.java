public class People {
  private String name;
  private int age;
  private String addr;

  public void setName(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String ar) {
    addr = ar;
  }

  public void setAge(int a) {
    if (a > 0 && a < 200) {
      age = a;
    } else {
      System.out.println("年龄非法！");
    }

  }

  public int getAge() {
    return age;
  }
}
