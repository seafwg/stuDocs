# Java:man_student:seafwg

## 一.java基础

### 1.1 变量：

#### 1.1.1 局部变量：

方法或者语句内部，从属与方法。

#### 1.1.2 成员变量

方法外部，类的内部，从属对象，生命周期伴随对象

#### 1.1.3静态变量

使用static定义，从属类，生命周期伴随类的始终，从类加载到卸载

### 1.2 常量

不能改变的值，final修饰的符号常常量。

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

**如果要比较，使用BigDecimal类进行比较**

#### 1.3.2 字符型变量/常量

**注意转义字符**

#### 1.3.3 运算符

**整数运算：**

> 1.两个数中有long类型，结果为long
>
> 2.没有long,结果为int.即使short,byte计算也是int

**浮点运运算：**

> 1.两个书中有double,结果为double.
>
> 2.只有两个数都是float时，结果才为float

##### 取余

```java
7%3=1
-7%3=-1
7%-3=1 // 余数符号和左边操作符相同
```

#### 1.3.4 逻辑运算符

| 运算符   | 符号           | 说明                                                         |
| -------- | -------------- | ------------------------------------------------------------ |
| 逻辑与   | &（与）        | 两者为true,结果true,其余为false                              |
| 逻辑或   | \| （或）      | 两者中有一个为true,结果为true,两个都为false,结果为false      |
| 逻辑异或 | ^（异或）      | 两者相同false,不同为true                                     |
| 逻辑非   | ！(非)         | 取反                                                         |
| 短路与   | &&（短路与）   | 只要有一个false,则返回false,**[第一个为false,整体条件直接返回，不去判断，第一个为true,则去执行第二个]**效率比较高 |
| 短路或   | \|\|（短路或） | 只要有一个true则返回true,**[第一个返回true，第二个不执行，整体条件满足，第一个为false,第二个执行]** |

#### 1.3.4 位运算

| 位运算符 | 说明                        |
| -------- | --------------------------- |
| ~        | 取反                        |
| &        | 按位与                      |
| \|       | 按位或                      |
| ^        | 按位异或                    |
| <<       | 左移运算，左移一位等价于乘2 |
| >>       | 右移运算，右移一位等价于除2 |

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

##  二. java面向对象基础

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

**[一个java文件可以有多个类，每一个源文件必须有且只有一个public class,并且类名和文件名必须一致]**

对于一个类来说，一般有三种常见的成员：属性field、方法method、构造器constructor。这三种成员都可以定义零个或多个

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
> 3.把新创建的调用类的实例赋值给该类的申明的实例对象(步骤1)
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
> 2.JVM为每个线程创建一个栈，用于存放该线程执行方法的信息(实际参数，局部变量等)
>
> 3.栈属于线程私有，不能实现线程间的共享
>
> 4.站的存储结构是"先进后出，后进先出"
>
> 5.栈是由系统自动分配，速度快，是一种连续的内存空间

#### 2.5.2 堆的特点：

> 1.对用于存储创建好的对象和数组(数组也是对象)
>
> 2.JVM只有堆，被所有线程共享
>
> 3.堆是一个不连续的内存空间，分配灵活，速度慢

**存放new创建的对象**

#### 2.5.3 方法区（静态区）：

> 1.JVM只有一个方法区，被所有线程共享
>
> 2.方法区实际也是堆，只是用于存储类，变量相关的信息
>
> 3.用来存放程序中永远不变或者唯一的内容（类信息【class对象】，静态变量，字符串常量等）

### 2.6 构造方法(构造器)constructor

**用于对象的初始化,构造器是一个创建对象时被自动调用的特殊方法，目的是对象的初始化。构造器的名称应与类的名称一致。Java通过new关键字来调用构造器，从而返回该类的实例，是一种特殊的方法。**

**[要点：]**

> 1.构造函数的方法名必须和类名一致
>
> 2.通过new子调用
>
> 3.构造器虽然有返回值，但是不能定义返回值类型(返回值的类型肯定是本类)，不能在构造器里使用return返回某个值。
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



### 2.8 创建对象和this

#### 2.8.1 创建一个对象的过程：

> 1.分配对象空间，并将成员变量初始化为0或者空
>
> 2.执行属性值的显式示初始化
>
> 3.执行构造方法
>
> 4.返回对象的地址给相关对象的变量

#### 2.8.2 this的本质

**[创建好的对象的地址]，由于在构造方法调用前，对象已经创建，因此在构造方法中也可以使用this,代表当前对象**

> 1.在程序中产生二义性之处，应使用this来指明当前对象;普通方法中，this总是指向调用该方法的对象。构造方法中，this总是指向正要初始化的对象。
>
> 2.使用this关键字调用重载的构造方法，避免相同的初始化代码。但只能在构造方法中用，并且必须位于构造方法的第一句。
>
> 3.this不能用于static方法中。

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

**static修饰的成员变量和方法，从属于类，普通变量和方法从属于对象的。**

**静态方法中不能调用非静态的方法(成员变量，成员方法)，静态方法存储在方法区中，对象的成员变量成员方法存储在堆中。在普通方法中可以调用静态方法和属性**

> 1. 为该类的公用变量，属于类，被该类的所有实例共享，在类被载入时被显式初始化。
>
> 　2. 对于该类的所有对象来说，static成员变量只有一份。被该类的所有对象共享!!
>
> 　3. 一般用“类名.类属性/方法”来调用。(也可以通过对象引用或类名(不需要实例化)访问静态成员。)
>
> 　4. 在static方法中不可直接访问非static的成员。

### 2.10 静态初始化块

**构造方法用于对象的初始化，静态初始化块，用于类的初始化操作，在静态初始化块中不能直接访问非static成员**

**【注意：】上溯到Object类，先执行Object的静态初始化块，再向下执行子类的静态初始化块，直到我们的类的静态初始化块为止。**

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

**java中，方法中所有的参数都是"值传递"，也就是"传递至的副本"**

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

**包机制是Java中管理类的重要手段，包对于类，相当于文件夹对于文件的作用**

我们通过package实现对类的管理，package的使用有两个要点：

> 1. 通常是类的第一句非注释性语句。
>
> 　2. 包名：域名倒着写即可，再加上模块名，便于内部管理类。

**包的导入**

如果我们要使用其他包的类，需要使用import导入，从而可以在本类中直接通过类名来调用，否则就需要书写类的完整包名和类名。import后，便于编写代码，提高可维护性。

**注意要点：**

>1. Java会默认导入java.lang包下所有的类，因此这些类我们可以直接使用。
>2. 如果导入两个同名的类，只能用包名+类名来显示调用相关类

## 三. java面向对象　　

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



| 修饰符    | 同一个类 | 同一个包 | 子类[其他包中的子类] | 所有类[其他包中的类] |
| --------- | -------- | -------- | -------------------- | -------------------- |
| private   | √        | ×        | ×                    | ×                    |
| default   | √        | √        | ×                    | ×                    |
| protected | √        | √        | √                    | ×                    |
| public    | √        | √        | √                    | √                    |

### 3.2 抽象类：

* 1. 有抽象方法的类，只能继承不能被初始化
* 2.抽象方法必须被子类实现
* 3.抽象类只能用于继承，他是规范

```java
package Oop2;

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
```

### 3.3 接口：

* 1.普通类：具体实现

* 2.抽象类：具体实现，规范(抽象方法)，【用于子类的继承规范】

* 3.接口：规范!

#### 3.3.1 申明格式：

```java
[访问修饰符]  interface 接口名   [extends  父接口1，父接口2…]  {
  常量定义;  
  方法定义;
}
```

* 1. 访问修饰符：只能是public或默认。

* 2. 接口名：和类名采用相同命名机制。

* 3. extends：接口可以多继承。

* 4. 常量：接口中的属性只能是常量，总是：public static final 修饰。不写也是。

* 5. 方法：接口中的方法只能是：public abstract。 省略的话，也是public abstract。

**要点：**

* 1. 子类通过implements来实现接口中的规范。

* 2. 接口不能创建实例，但是可用于声明引用变量类型。

* 3. 一个类实现了接口，必须实现接口中所有的方法，并且这些方法只能是public的。

* 4. JDK1.7之前，接口中只能包含静态常量、抽象方法，不能有普通属性、构造方法、普通方法。

* 5. JDK1.8后，接口中包含普通的静态方法。

```java
package Oop2;

public class TestInterface {
  public static void main(String[] args) {
    MySelf my = new MySelf();
    my.task();
    my.eat();
    my.gold();
    my.allFn();
  }
}

interface Demo {
  int AGE = 99; // public static final修饰

  void plan(); // 默认public abstruct 修饰

  void work();
}

interface Stu {
  void task();

  void eat();
}

interface BigStu {
  void gold();
}

interface AllInter extends Stu, BigStu {
  public void allFn();
}

class MySelf implements AllInter {
  public void task() {
    System.out.println("Stu interface Func");
  }

  public void eat() {
    System.out.println("Stu interface Func");
  }

  public void gold() {
    System.out.println("BigStu interface Func");
  }

  public void allFn() {
    System.out.println("AllInter interface Func");
  }
}
```

### 3.4 内部类

**一般情况，我们把类定义成独立的单元。有些情况下，我们把一个类放在另一个类的内部定义，称为内部类**

**注意:**

`内部类只是一个编译时概念，一旦我们编译成功，就会成为完全不同的两个类。对于一个名为Outer的外部类和其内部定义的名为Inner的内部类。编译完成后会出现Outer.class和Outer$Inner.class两个类的字节码文件。所以内部类是相对独立的一种存在，其成员变量/方法名可以和外部类的相同。`

```java
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
```

**作用：**

* 1. 内部类提供了更好的封装。只能让外部类直接访问，不允许同一个包中的其他类直接访问。

* 2. 内部类可以直接访问外部类的私有属性，内部类被当成其外部类的成员。 但外部类不能访问内部类的内部属性。

* 3. 接口只是解决了多重继承的部分问题，而内部类使得多重继承的解决方案变得更加完整。

#### 3.4.1 创建与使用：

**访问：**

通过外部类的引用`.`去访问，或者先创建外部类通过外部类的引用创建内部类

```
OuterClass.InnerClass inner = new OuterClass().new InnerClass();
// 等价于：
OuterClass outer = new OuterClass();
OuterClass.InnerClass inner = outer.new InnerClass();
```



```java
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
```













































74:



```java
### 
  2.3
  0.3 ==> 9
  2.0 ==> 15
###
  6.15: 10K
    4.3 + 2 + 1 = 7.3 + 1 = 8.3 ---> 2
```



艳阳红似火

一声惊雷漫天雨

叱咤间

物是人非















# 每天两个小时java

> 1.保证一小时的视频学习
>
> 2.保证一小时的代码联系

# 周末保证一天的时间java

> 1.视频学习
>
> 2.实践联系结合

