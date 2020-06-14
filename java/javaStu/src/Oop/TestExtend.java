package Oop;

public class TestExtend {
  public static void main(String[] args) {
    Person p = new Person("seafwg", 23, "code");
    System.out.println(p.name);
    System.out.println(p.age);
    System.out.println(p.work);
  }
}

class Human {
  String name;
  int age;
  String work;

  public void action() {
    System.out.println("work....");
  }
}

class Person extends Human {
  String carrer;
  int id;

  // 构造函数：
  public Person(String name, int age, String work) {
    this.name = name;
    this.age = age;
    this.work = work;
  }
}
