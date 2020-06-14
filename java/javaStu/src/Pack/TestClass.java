package Pack;

public class TestClass {
  public static void main(String[] args) {
    /**
     * 每一个源文件必须有且只有一个public class,并且类名和文件名必须一致
     */
  }
}

class TestOthersClass { // 一个java文件中有多个class代码块
  void others() {

  }
}

/**
 * 创建一个学生类：
 */
class TestStu {
  /**
   * ? 最常见的成员有三类: 1.属性(成员变量) 2.方法 3.构造器constructor
   */
  // 属性(成员变量)
  int id;
  String name;
  int age;
  String hobby;

  // 方法
  void study() {
    System.out.println("最主要的任务是学习");
  }

  // 类的构造方法
  TestStu() {
    // ...
  }
}