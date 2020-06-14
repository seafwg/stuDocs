package Oop;

/*
* /? 判断一个对象/实例是否是由那个类(类的回溯子类到父类一直到Object)所创建的.返回true/false
*/
public class TestInstanceof {
  public static void main(String[] args) {
    Person1 p = new Person1();
    System.out.println(p instanceof Person1); // true
    Child c = new Child();
    System.out.println(c instanceof Child);
    System.out.println(c instanceof Person1);
    System.out.println(c instanceof Object);
  }
}

class Person1 {

}

class Child extends Person1 {

}