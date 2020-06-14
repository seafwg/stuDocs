package App;

public class TestClass {
  Computer computer; // 1.引用其他类，并实例对象

  public static void main(String[] args) { // 主方法程序的入口
    TestClass tc = new TestClass(); // 类通过new关键字创建对象/实例[通过new调用了类的构造方法]
    tc.task(); // 实例/对象调用自己的方法
    // 创建Computer类
    Computer c = new Computer(); // 2.创建其他类，给类添加属性或者方法
    c.brand = "thankpad";

    tc.computer = c; // 3.新创建的调用的类的实例赋值给类的实例属性
    tc.code();
  }

  TestClass() { // 类的构造方法，用于创建自己

  }

  /**
   * 类的属性和方法：
   */
  String name;
  int age;
  String hobby;

  void task() {
    System.out.println("study!");
  }

  void code() {
    System.out.println("coding use for " + computer.brand);
  }
}

class Computer {
  String brand;
}