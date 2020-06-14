package Oop;

public class TestEncapsultion {
  public static void main(String[] args) {

  }
}

// 封装注意细节：类的属性设置成私有，对外提供public的访问方法和设置方法
class Peoples {
  private String name;
  private int age;
  private boolean boy;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isBoy() {
    return boy;
  }

  public void setBoy(boolean boy) {
    this.boy = boy;
  }
}