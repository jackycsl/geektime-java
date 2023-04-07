public class ForceChange {
  public static void main(String[] args) {
    // short类型变量，内存中2个字节
    short s = 1;// 2个字节
    // 出现编译失败
    // s和1做运算的时候，1是int类型，s会被提升为int类型
    // s+1后的结果是int类型，将结果在赋值会short类型时发生错误
    // short内存2个字节，int类型4个字节
    // 必须将int强制转成short才能完成赋值
    // s = s + 1;//编译失败
    s = (short) (s + 1);// 编译成功
  }
}
