public class App {
  int c = 34; // 成员变量
  static int d = 56; // 静态变量

  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
    {
      int a = 12; // 局部变量
    }
    int b = 23; // 局部变量
    // 类似递归
    outer: for (int i = 101; i < 150; i++) {
      for (int j = 2; j < i / 2; j++) {
        if (i % j == 0) {
          continue outer; // 不带标签跳到外层循环开始
        }
      }
      System.out.println(i + "");
    }

    App a = new App();
    a.testFn();
  }

  void testFn() {
    System.out.println("hello seafwg");
  }
}
