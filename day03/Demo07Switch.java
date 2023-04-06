public class Demo07Switch {
  public static void main(String[] args) {
    // 定义月份变量，判断季节
    int month = 9;
    // switch语句实现选择
    switch (month) {
      case 12:
      case 1:
      case 2:
        System.out.println("冬季");
        break;
      case 3:
      case 4:
      case 5:
        System.out.println("春季");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("夏季");
        break;
      case 9:
      case 10:
      case 11:
        System.out.println("秋季");
        break;
      default:
        System.out.println("你输入的月份数字有误");
        break;
    }
  }
}
