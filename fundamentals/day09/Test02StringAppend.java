public class Test02StringAppend {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };
    String s = intArrToString(arr);
    System.out.println(s);
  }

  public static String intArrToString(int[] arr) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        sb.append("[" + arr[i] + ",");
      } else if (i == arr.length - 1) {
        sb.append(arr[i] + "]");
      } else {
        sb.append(arr[i] + ",");
      }
    }
    return sb.toString();
  }
}
