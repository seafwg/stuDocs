package Pack;

public class TestStudents {
  /**
   * ? 属性
   */
  int id;
  String name;
  int age;
  Computer computer;

  void study() {
    System.out.println("coding...");
  }

  // 类的构造方法：
  TestStudents() {

  }

  // 类的主方法：
  public static void main(String[] args) {
    // 创建学生
    TestStudents tStu = new TestStudents();
    tStu.name = "seafwg";
    // 分派电脑，创建电脑类
    /**
     * ? 在类[A]中调用其它类[B]的步骤：1.在A类的属性中引入类型并申明实例。
     * 2.创建B类的实例。3.初始化[B]类的实例属性。4.第二部创建的实例赋值给A类实例的属性。
     */
    Computer computer1 = new Computer();
    computer1.brand = "thinkpad";
    tStu.computer = computer1;
    tStu.study();
    System.out.println(tStu.computer.brand);
  }
}

class Computer { // Computer 类
  String brand; // 电脑品牌
}