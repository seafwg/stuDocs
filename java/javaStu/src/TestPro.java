import java.util.Scanner;

public class TestPro {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("请输入你的姓名：");
    String name = s.nextLine();
    System.out.println("请输入您的爱好！");
    String hobby = s.nextLine();
    System.out.println("请输入您的年龄！");
    int age = s.nextInt();

    System.out.println(name);
    System.out.println(hobby);
    System.out.println(age);

    int a = 15; // 十进制
    int b = 015; // 0开头8进制
    int c = 0x15; // 0x开头16进制
    int d = 0b101011; // 0b开头二进制
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);

    float f = 0.1f;
    double e = 1.0 / 10;
    System.out.println(f == e);

  }
}