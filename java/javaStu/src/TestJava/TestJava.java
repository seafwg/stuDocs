package TestJava;

public class TestJava {
  public static void main(String[] args) {
    Base base = new Child();
    // 实例化时类型由前面的类型决定
    // base.methodB();
    base.method();
  }
}

class Base {
  public void method() {
    System.out.print("Base method");
  }
}

class Child extends Base {
  public void methodB() {
    System.out.print("Child methodB");
  }
}