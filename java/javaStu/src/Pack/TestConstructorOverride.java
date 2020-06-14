package Pack;

public class TestConstructorOverride {
  int id;
  String name;
  int age;
  String gender;
  String addr;

  // 对象的初始化
  TestConstructorOverride(int id, String name) {
    this.id = id;
    this.name = name;
  }

  // 构造函数的重载，初始化对象
  TestConstructorOverride(int id, String name, int age, String gender, String addr) {
    this(id, name); // 调用带参的构造方法，并且必须位于第一行！
    // this.id = id;
    // this.age = age;
    this.gender = gender;
    this.addr = addr;
  }

  void printFn() {
    System.out.println(this.id + this.name + this.age + this.gender + this.addr);
  }

  public static void main(String[] args) {
    TestConstructorOverride tCO = new TestConstructorOverride(12, "seafwg", 18, "男", "guanghzou");
    tCO.printFn();
  }
}