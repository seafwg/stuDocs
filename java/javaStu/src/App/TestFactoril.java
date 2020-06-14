package App;

public class TestFactoril {
  public static void main(String[] args) {
    int res = factoril(10);
    System.out.println(res);
    int res1 = factorilLoop(10);
    System.out.println(res1);
  }

  static int factoril(int a) {
    if (a == 1) {
      return 1;
    } else {
      return a * factoril(a - 1);
    }
  }

  static int factorilLoop(int a) {
    int res = 1;
    while (a > 1) {
      res *= a * (a - 1); // res = res*(a*(a-1));
      a -= 2; // a = a - 2;
    }
    return res;
  }
}