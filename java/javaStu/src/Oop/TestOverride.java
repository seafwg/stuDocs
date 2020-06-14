package Oop;

public class TestOverride {
  public static void main(String[] args) {
    Animal a = new Animal();
    Human1 h = new Human1("seafwg", 230);
    Dog d = new Dog("lam", 4);
    a.toString();
    h.toString();
    d.toString();
    a.eat();
    h.eat();
    d.eat();
  }
}

class Animal {
  String name;
  int age;

  public void eat() {
    System.out.println("吃东西...");
  }

  @Override
  public String toString() {
    System.out.println("override toString methods");
    return "姓名：" + name + "年龄：" + age;
  }
}

class Human1 extends Animal {
  public Human1() {
  }

  public Human1(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public void eat() {
    System.out.println("Human eating foods");
  }
}

class Dog extends Animal {
  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void eat() {
    System.out.println("Dog eating meat");
  }
}