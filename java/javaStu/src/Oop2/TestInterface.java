package Oop2;

public class TestInterface {
  public static void main(String[] args) {
    MySelf my = new MySelf();
    my.task();
    my.eat();
    my.gold();
    my.allFn();
  }
}

interface Demo {
  int AGE = 99; // public static final修饰

  void plan(); // 默认public abstruct 修饰

  void work();
}

interface Stu {
  void task();

  void eat();
}

interface BigStu {
  void gold();
}

interface AllInter extends Stu, BigStu {
  public void allFn();
}

class MySelf implements AllInter {
  public void task() {
    System.out.println("Stu interface Func");
  }

  public void eat() {
    System.out.println("Stu interface Func");
  }

  public void gold() {
    System.out.println("BigStu interface Func");
  }

  public void allFn() {
    System.out.println("AllInter interface Func");
  }
}