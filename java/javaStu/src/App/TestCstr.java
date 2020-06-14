package App;

public class TestCstr {
  public static void main(String[] args) {
    Pointer p = new Pointer(3.0, 4.0); // ? 2.通过new关键字调用
    Pointer o = new Pointer(0.0, 0.0);
    System.out.println(p.getDistance(o));
  }
}

class Pointer {
  double x, y;

  // Pointer的构造器函数
  /**
   * ? 1.和类名相同
   * 
   * @param _x
   * @param _y
   */
  public Pointer(double _x, double _y) {
    x = _x;
    y = _y;
    // ? 3.虽然有返回值，但不能定义返回值的类型，可以return ;结束语句
    return;
    // ? 4.如果不定义构造函数，系统会自动添加一个无参的构造函数
  }

  public double getDistance(Pointer p) {
    return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
  }
}