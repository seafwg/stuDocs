package Oop;

public class TestEquals {
  public static void main(String[] args) {
    Humans h = new Humans(1212, "seafwg");
    Humans h1 = new Humans(1212, "seafwg");
    System.out.println(h.equals(h1));
  }
}

class Humans {
  int id;
  String name;

  public Humans(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public boolean equals(Object obj) { // 重写Object的equals方法：
    if (obj == null) {
      return false;
    } else {
      if (obj instanceof Humans) {
        Humans p = (Humans) obj; // 强制类型转换
        if (p.id == this.id) {
          return true;
        }
      }
    }
    return false;
  }
}