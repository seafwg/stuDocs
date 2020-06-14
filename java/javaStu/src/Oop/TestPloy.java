package Oop;

public class TestPloy {
  public static void main(String[] args) {
    Dog1 d = new Dog1();
    // 通过方法传递创建的实例，传递谁的对象，就可以调用谁的方法
    animalAction(d);
    Cat1 c = new Cat1();
    animalAction(c);
  }

  // 创建一个静态方法进行接收超类
  static void animalAction(Animal1 a) {
    a.eat();
  }
}

class Animal1 {
  public void eat() {
    System.out.println("吃东西长身体...");
  }
}

class Dog1 extends Animal1 {
  public void eat() {
    System.out.println("狗子吃骨头...");
  }
}

class Cat1 extends Animal1 {
  public void eat() {
    System.out.println("喵咪吃猫粮...");
  }
}