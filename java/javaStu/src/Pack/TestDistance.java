package Pack;

public class TestDistance {
  public static void main(String[] args) {
    Point p = new Point(3.0, 4.0); // 创建其他类的实例
    Point o = new Point(0, 0);
    System.out.println(p.getDistance(o)); // 通过实例调用他的方法
  }
}

//
class Point {
  double x, y;

  Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getDistance(Point p) {
    return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
  }
}