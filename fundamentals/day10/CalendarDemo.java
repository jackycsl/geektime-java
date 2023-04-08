import java.util.Calendar;

public class CalendarDemo {
  public static void main(String[] args) {
    // 1.获取一个GregorianCalendar对象
    Calendar instance = Calendar.getInstance();// 获取子类对象
    // 2.打印子类对象
    System.out.println(instance);
    // 3.获取属性
    int year = instance.get(Calendar.YEAR);
    int month = instance.get(Calendar.MONTH) + 1;// Calendar的月份值是0-11
    int day = instance.get(Calendar.DAY_OF_MONTH);

    int hour = instance.get(Calendar.HOUR);
    int minute = instance.get(Calendar.MINUTE);
    int second = instance.get(Calendar.SECOND);
    int week = instance.get(Calendar.DAY_OF_WEEK);// 返回值范围：1--7，分别表示："星期日","星期一","星期二",...,"星期六"

    System.out.println(year + "年" + month + "月" + day + "日" + hour + ":" + minute + ":" + second);
    System.out.println(getWeek(week));

    // 设置属性——set(int field,int value):
    Calendar c1 = Calendar.getInstance();// 获取当前日期

    // 计算雄哥出生那天是星期几(假如雄哥出生日期为：1998年3月18日)
    c1.set(Calendar.YEAR, 1998);
    c1.set(Calendar.MONTH, 3 - 1);// 转换为Calendar内部的月份值
    c1.set(Calendar.DAY_OF_MONTH, 18);

    int w = c1.get(Calendar.DAY_OF_WEEK);
    System.out.println("雄哥出生那天是：" + getWeek(w));

    // 计算200天以后是哪年哪月哪日，星期几？
    Calendar c2 = Calendar.getInstance();// 获取当前日期
    c2.add(Calendar.DAY_OF_MONTH, 200);// 日期加200

    int y = c2.get(Calendar.YEAR);
    int m = c2.get(Calendar.MONTH) + 1;// 转换为实际的月份
    int d = c2.get(Calendar.DAY_OF_MONTH);

    int wk = c2.get(Calendar.DAY_OF_WEEK);
    System.out.println("200天后是：" + y + "年" + m + "月" + d + "日" + getWeek(wk));

  }

  // 查表法，查询星期几
  public static String getWeek(int w) {// w = 1 --- 7
    // 做一个表(数组)
    String[] weekArray = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
    // 索引 [0] [1] [2] [3] [4] [5] [6]
    // 查表
    return weekArray[w - 1];
  }
}
