// 业务逻辑异常
public class LoginException extends Exception {
  /**
   * 空参构造
   */
  public LoginException() {
  }

  /**
   *
   * @param message 表示异常提示
   */
  public LoginException(String message) {
    super(message);
  }
}
