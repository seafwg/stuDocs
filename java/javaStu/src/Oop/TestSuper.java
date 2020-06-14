package Oop;

public class TestSuper {
  public static void main(String[] args) {
    ChildClass c = new ChildClass();
    c.work();
  }
}

class FatherClass {
  String name;
  int age;

  public void work() {
    System.out.println("我的爸爸很辛苦");
  }
}

class ChildClass extends FatherClass {
  public void work() {
    // 可以通过super来访问父类中被子类覆盖的方法或属性
    super.work(); // 调用父类的无参的构造方法
    System.out.println("我很想变强...");
  }
}