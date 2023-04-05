/**
 * VariableThreeFormat
 */
public class VariableThreeFormat {
  public static void main(String[] args) {
    // 格式一：声明变量并赋值
    // 数据类型 变量名 = 数据值; 比如
    int age = 18;
    System.out.println(age);
    // 格式二：先声明，后赋值(使用前赋值即可) 数据类型 变量名;
    // 变量名 = 初始化值;
    double money;
    money = 55.5;
    System.out.println(money);
    // 格式三：同一行定义多个同一种数据类型的变量，中间使用逗号隔开。
    // 但不建议使用这种方式，降低程序的可读性。
    int a = 10, b = 20; // 定义int类型的变量a和b，中间使用逗号隔开
    System.out.println(a);
    System.out.println(b);

    int c, d; // 声明int类型的变量c和d，中间使用逗号隔开
    c = 30;
    d = 40;
    System.out.println(c);
    System.out.println(d);
  }

}
