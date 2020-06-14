package Oop2;

/*
* 抽象类：
* 1.有抽象方法的类，只能继承不能被初始化
* 2.抽象方法必须被子类实现
* 3.抽象类只能用于继承，他是规范
*/
public class TestAbstract {
  public static void main(String[] args) {
    Sun s = new Sun();
    s.plan();
  }
}

abstract class Father {
  public abstract void plan();
}

class Sun extends Father {
  public void plan() {
    System.out.println("实现了父类的抽象方法");
  }
}