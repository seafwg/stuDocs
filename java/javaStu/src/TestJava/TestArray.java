package TestJava;

public class TestArray {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 4, 5, 6, 7, 7, 7, 8, 8, 9 };
    for (int item : arr) {
      System.out.println(item);
    }
    System.out.println("++++++++++++");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}