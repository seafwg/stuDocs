package Oop2;

public class TestInnerClass {
  public static void main(String[] args) {
    OuterClass.InnerClass innter = new OuterClass().new InnerClass();
    innter.innerMethods();
    System.out.println("+++++++++++++++++++++++++");
    // 等价于
    OuterClass outer = new OuterClass();
    outer.outerMethods();
    OuterClass.InnerClass in = outer.new InnerClass();
    in.innerMethods();
  }
}

class OuterClass {
  int outerInter = 100;

  public void outerMethods() {
    System.out.println("OuterMethods...");
  }

  class InnerClass {
    public void innerMethods() {
      System.out.println("InnnerMethods...");
      System.out.println(outerInter);
    }
  }
}