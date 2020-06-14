package App;

import java.util.Scanner;

public class TestScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("input in yours name");
    String name = scanner.nextLine();
    System.out.println(name);
  }
}