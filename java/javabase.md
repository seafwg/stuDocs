# Java:man_student:seafwg

## 一.java 基础

### 1.1 变量：

#### 1.1.1 局部变量：

方法或者语句内部，从属与方法。

#### 1.1.2 成员变量

方法外部，类的内部，从属对象，生命周期伴随对象

#### 1.1.3 静态变量

使用 static 定义，从属类，生命周期伴随类的始终，从类加载到卸载

### 1.2 常量

不能改变的值，final 修饰的符号常常量。

### 1.3 基本数据类型

![](C:\Users\ThinkPad\Desktop\微信截图_20200531003215.png)

**【进制】**

```java
int a = 15; // 十进制
int b = 015; // 0开头8进制,容易混淆
int c = 0x15; // 0x开头16进制
int d = 0b101011; // 0b开头二进制
```

#### 1.3.1 浮点型

> ##### 1.float
>
> ##### 2.double

**[浮点型数据是不精确的，一定不要用于比较]**

```java
float f = 0.1f;
double d = 1.0/10;
System.out.println(f==d);// false
```

**如果要比较，使用 BigDecimal 类进行比较**

#### 1.3.2 字符型变量/常量

**注意转义字符**

#### 1.3.3 运算符

**整数运算：**

> 1.两个数中有 long 类型，结果为 long
>
> 2.没有 long,结果为 int.即使 short,byte 计算也是 int

**浮点运运算：**

> 1.两个书中有 double,结果为 double.
>
> 2.只有两个数都是 float 时，结果才为 float

##### 取余

```java
7%3=1
-7%3=-1
7%-3=1 // 余数符号和左边操作符相同
```

#### 1.3.4 逻辑运算符

| 运算符   | 符号           | 说明                                                                                                                  |
| -------- | -------------- | --------------------------------------------------------------------------------------------------------------------- |
| 逻辑与   | &（与）        | 两者为 true,结果 true,其余为 false                                                                                    |
| 逻辑或   | \| （或）      | 两者中有一个为 true,结果为 true,两个都为 false,结果为 false                                                           |
| 逻辑异或 | ^（异或）      | 两者相同 false,不同为 true                                                                                            |
| 逻辑非   | ！(非)         | 取反                                                                                                                  |
| 短路与   | &&（短路与）   | 只要有一个 false,则返回 false,**[第一个为 false,整体条件直接返回，不去判断，第一个为 true,则去执行第二个]**效率比较高 |
| 短路或   | \|\|（短路或） | 只要有一个 true 则返回 true,**[第一个返回 true，第二个不执行，整体条件满足，第一个为 false,第二个执行]**              |

#### 1.3.4 位运算

| 位运算符 | 说明                         |
| -------- | ---------------------------- |
| ~        | 取反                         |
| &        | 按位与                       |
| \|       | 按位或                       |
| ^        | 按位异或                     |
| <<       | 左移运算，左移一位等价于乘 2 |
| >>       | 右移运算，右移一位等价于除 2 |

### 1.4 自动类型转化：

**【容量小的数据类型可以自动转化位容量大的】**

![](C:\Users\ThinkPad\Desktop\微信截图_20200531015914.png)

实线可以转换，虚线转换损失精确度

#### 1.4.1 强制转化

**[强制转换会损失精确度]**

```java
double x = 3.14;
int nt = (int)x; // 强制转换 值为3
```

## 二. java 面向对象基础

### 2.1 方法

**【用来完成特定功能的代码片段，类似与其他语言的函数】**

#### 2.1 定义:

```java
返回值/类型 方法名(形参) {
  xxx;
}
// eg：
void demoFn(int s) {
  System.out.println("hello world");
}
```

#### 2.2 调用：

**[通过对象调用方法]**

```java
public class Test{
  public static void main(String[] args) {
    demoFn t = new Test();
    t.demoFn();// 调用
  }
}
```

### 2.2 方法重载

**[实际时完全不同的方法，只是名称相同而已，参数不同]**

条件:

> 1.不同的含义：形参类型，形参个数，形参顺序
>
> 2.返回值不同构不成方法的重载

### 2.3 递归

> 1.定义递归头：什么时候调用自身，如果没有递归头，将陷入死循环，递归头也就是结束的条件。
>
> 2.递归体：什么时候调用自己。

```java
static int factoril(int a) {
  if (a == 1) { // 递归头
    return 1;
  } else { // 递归体
    return a * factoril(a - 1);
  }
}
```

**[递归极度耗时，递归可以通过循环来实现]**

```java
//## 计算10!
static int factoril(int a) {
    if (a == 1) {
      return 1;
    } else {
      return a * factoril(a - 1);
    }
  }

  static int factorilLoop(int a) {
    int res = 1;
    while (a > 1) {
      res *= a * (a - 1); // res = res*(a*(a-1));
      a -= 2; // a = a - 2;
    }
    return res;
  }
```

### 2.4 类：

**[一个 java 文件可以有多个类，每一个源文件必须有且只有一个 public class,并且类名和文件名必须一致]**

对于一个类来说，一般有三种常见的成员：属性 field、方法 method、构造器 constructor。这三种成员都可以定义零个或多个

```java
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
```

**调用其它类：**

> 1.引用其他类并实例对象，并设置为该类的属性
>
> 2.创建调用类，并其给他添加属性和方法
>
> 3.把新创建的调用类的实例赋值给该类的申明的实例对象(步骤 1)
>
> 4.该类中可以使用其调用过来类的属性和方法

```JAVA
package App;

public class TestClass {
  Computer computer; // 1.引用其他类，并实例对象

  public static void main(String[] args) { // 主方法程序的入口
    TestClass tc = new TestClass(); // 类通过new关键字创建对象/实例[通过new调用了类的构造方法]
    tc.task(); // 实例/对象调用自己的方法
    // 创建Computer类
    Computer c = new Computer(); // 2.创建调用类，给类添加属性或者方法
    c.brand = "thankpad";

    tc.computer = c; // 3.新创建的调用的类的实例赋值给类的实例属性
    tc.code();
  }

  TestClass() { // 类的构造方法，用于创建自己

  }

  /**
   * 类的属性和方法：
   */
  String name;
  int age;
  String hobby;

  void task() {
    System.out.println("study!");
  }

  void code() {
    System.out.println("coding use for " + computer.brand);
  }
}

class Computer {
  String brand;
}
```

### 2.5 内存分析

#### 2.5.1 栈的特点：

> 1.站描述的是方法执行的内存模型，每个方法被调用都会创建一个栈（存储局部变量，操作数，方法出口等）
>
> 2.JVM 为每个线程创建一个栈，用于存放该线程执行方法的信息(实际参数，局部变量等)
>
> 3.栈属于线程私有，不能实现线程间的共享
>
> 4.站的存储结构是"先进后出，后进先出"
>
> 5.栈是由系统自动分配，速度快，是一种连续的内存空间

#### 2.5.2 堆的特点：

> 1.对用于存储创建好的对象和数组(数组也是对象)
>
> 2.JVM 只有堆，被所有线程共享
>
> 3.堆是一个不连续的内存空间，分配灵活，速度慢

**存放 new 创建的对象**

#### 2.5.3 方法区（静态区）：

> 1.JVM 只有一个方法区，被所有线程共享
>
> 2.方法区实际也是堆，只是用于存储类，变量相关的信息
>
> 3.用来存放程序中永远不变或者唯一的内容（类信息【class 对象】，静态变量，字符串常量等）

### 2.6 构造方法(构造器)constructor

**用于对象的初始化,构造器是一个创建对象时被自动调用的特殊方法，目的是对象的初始化。构造器的名称应与类的名称一致。Java 通过 new 关键字来调用构造器，从而返回该类的实例，是一种特殊的方法。**

**[要点：]**

> 1.构造函数的方法名必须和类名一致
>
> 2.通过 new 子调用
>
> 3.构造器虽然有返回值，但是不能定义返回值类型(返回值的类型肯定是本类)，不能在构造器里使用 return 返回某个值。
>
> 4.如果没有定义构造器，编译器会自动定义一个无参的构造函数，如果已经定义了，编译器不会自动添加。

```java
package App;

public class TestCstr {
  public static void main(String[] args) {
    Pointer p = new Pointer(3.0, 4.0); // ? 2.通过new关键字调用
    Pointer o = new Pointer(0.0, 0.0);
    System.out.println(p.getDistance(o));
  }
}

class Pointer {
  double x, y;

  // Pointer的构造器函数
  /**
   * ? 1.和类名相同
   *
   * @param _x
   * @param _y
   */
  public Pointer(double _x, double _y) {
    x = _x;
    y = _y;
    // ? 3.虽然有返回值，但不能定义返回值的类型，可以return ;结束语句
    return;
    // ? 4.如果不定义构造函数，系统会自动添加一个无参的构造函数
  }

  public double getDistance(Pointer p) {
    return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
  }
}
```

### 2.7 构造函数的重载

```java
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
    this.id = id;
    this.age = age;
    this.gender = gender;
    this.addr = addr;
  }
}
```

### 2.8 创建对象和 this

#### 2.8.1 创建一个对象的过程：

> 1.分配对象空间，并将成员变量初始化为 0 或者空
>
> 2.执行属性值的显式示初始化
>
> 3.执行构造方法
>
> 4.返回对象的地址给相关对象的变量

#### 2.8.2 this 的本质

**[创建好的对象的地址]，由于在构造方法调用前，对象已经创建，因此在构造方法中也可以使用 this,代表当前对象**

> 1.在程序中产生二义性之处，应使用 this 来指明当前对象;普通方法中，this 总是指向调用该方法的对象。构造方法中，this 总是指向正要初始化的对象。
>
> 2.使用 this 关键字调用重载的构造方法，避免相同的初始化代码。但只能在构造方法中用，并且必须位于构造方法的第一句。
>
> 3.this 不能用于 static 方法中。

```java
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
```

### 2.9 static 关键字

**static 修饰的成员变量和方法，从属于类，普通变量和方法从属于对象的。**

**静态方法中不能调用非静态的方法(成员变量，成员方法)，静态方法存储在方法区中，对象的成员变量成员方法存储在堆中。在普通方法中可以调用静态方法和属性**

> 1. 为该类的公用变量，属于类，被该类的所有实例共享，在类被载入时被显式初始化。
>
> 2. 对于该类的所有对象来说，static 成员变量只有一份。被该类的所有对象共享!!
>
> 3. 一般用“类名.类属性/方法”来调用。(也可以通过对象引用或类名(不需要实例化)访问静态成员。)
>
> 4. 在 static 方法中不可直接访问非 static 的成员。

### 2.10 静态初始化块

**构造方法用于对象的初始化，静态初始化块，用于类的初始化操作，在静态初始化块中不能直接访问非 static 成员**

**【注意：】上溯到 Object 类，先执行 Object 的静态初始化块，再向下执行子类的静态初始化块，直到我们的类的静态初始化块为止。**

```java
public class User3 {
    int id;
    String name;
    String pwd;
    static String company;
    static {
        System.out.println("seafwg");
        company = "hanzhi";
        printCompany();
    }
    public static void printCompany(){
        System.out.println(company);
    }
    public static void main(String[] args) {
        User3  u3 = new User3();
    }
}
// seafwg
// hanzhi
```

### 2.11 参数传参机制

**java 中，方法中所有的参数都是"值传递"，也就是"传递至的副本"**

**[引用类型参数的传值]，但是引用类型指的是对象的地址，副本和原参数都指向了同一个地址，改变副本指向地址的对象值，也就意味着原参数对象的地址也发生变化了。**

```java
public class User {
    int id;        //id
    String name;   //账户名
    String pwd;   //密码

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void testParameterTransfer01(User  u){
        u.name="assassin";
    }

    public void testParameterTransfer02(User  u){
        u  =  new User(200,"intelwisd");
    }

    public static void main(String[] args) {
        User u1  = new User(100, "seafwg"); // 传参初始化实例

        u1.testParameterTransfer01(u1); // 实例调用了函数，但传递时传递的是实例，方法中修改了实力的属性，因为传递的实例，具有相同的地址。
        System.out.println(u1.name);  //assassin

        u1.testParameterTransfer02(u1); // 该方法传递实例后通过实例创建了一个实例，并且初始化实例
        System.out.println(u1.name); // assassin
    }
}
```

### 2.12 包

**包机制是 Java 中管理类的重要手段，包对于类，相当于文件夹对于文件的作用**

我们通过 package 实现对类的管理，package 的使用有两个要点：

> 1. 通常是类的第一句非注释性语句。
>
> 2. 包名：域名倒着写即可，再加上模块名，便于内部管理类。

**包的导入**

如果我们要使用其他包的类，需要使用 import 导入，从而可以在本类中直接通过类名来调用，否则就需要书写类的完整包名和类名。import 后，便于编写代码，提高可维护性。

**注意要点：**

> 1.  Java 会默认导入 java.lang 包下所有的类，因此这些类我们可以直接使用。
> 2.  如果导入两个同名的类，只能用包名+类名来显示调用相关类

## 三. java 面向对象　　

### 3.1 继承

**实现类的扩展**

```java
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

class Person extends Human { // extends 关键字
  String carrer;

  // 构造函数：
  public Person(String name, int age, String work) {
   	// 父类的属性，通过自身构造函数实现初始化
    this.name = name;
    this.age = age;
    this.work = work;
  }
}
```
