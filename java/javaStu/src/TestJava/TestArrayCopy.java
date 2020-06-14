package TestJava;

public class TestArrayCopy {
  public static void main(String[] args) {
    String[] arr = { "seafwg", "intelwisdom", "assassion" };
    String[] arr1 = new String[6];
    // System.arraycopy(s, 0, sBak, 0, s.length);
    System.arraycopy(arr, 1, arr1, 0, 2);
    for (String item : arr1) {
      System.out.println(item);
    }
  }
}