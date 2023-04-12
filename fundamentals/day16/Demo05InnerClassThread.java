public class Demo05InnerClassThread {
  public static void main(String[] args) {
    Runnable r = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 20; i++) {
          System.out.println("Thread-01 : " + i);
        }
      }
    };
    new Thread(r).start();

    for (int i = 0; i < 20; i++) {
      System.out.println("main : " + i);
    }
  }
}
