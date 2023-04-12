import java.util.concurrent.Callable;

public class MyStrCallable implements Callable<String[]> {
  private String str;

  public MyStrCallable(String str) {
    this.str = str;
  }

  @Override
  public String[] call() throws Exception {
    return str.split(" +");// +正在表达式表示一次或多次空格
  }
}
