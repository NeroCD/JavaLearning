Java 程序中最基本的组成单位是类

```java
public class Classname {
    // main 是程序入口方法
    public static void main (String[] args) {}
}
```

Java 编译

```java
// 编译
javac CodeFileName.java
// 执行
java ClassName
```

Java 语法中的不同

```java
// 变量
byte b;
long l = 100L; // long 与 float 后需要加 L 或 F 是因为整数默认为 int, 浮点数默认为 double
float f = 3.14F;

// byte short char 参与运算时均会自动转为 int 类型
byte a = 1, b = 1, c;
c = a + b;	// 报错
c = (byte)(a + b);	// 正确
// 计算过程中类型自动提升
// byte,short,char -> int -> long -> float -> double

// 加号运算若有字符串项 则合并字符串
System.out.println(6 + "味地黄丸"); // 输出 6味地黄丸

/*
& 逻辑与 不论左边真假，右边都要执行
&& 短路逻辑与 左边为假则右边不执行
|, || 逻辑非 短路逻辑非
*/

int flag = 1 > 2 ? 1 : 0	// 0
```

数组

```java
int arr[] = new int[]{1, 2, 3};
int arr[] = new int[3];
int len = arr.length;
```

Java 数据输入

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);	// 创建 Scanner 对象
int i = sc.nextInt();	// 将键盘输入的值作为 int 返回
```

重载：一个类中定义的函数有相同的方法名，不同数量或类型的参数

```java
// 正确案例
public static void f(int a);
public static void f(double a);
public static void f(int a, int b);

// 错误案例
public static void f(int a);
public static int f(int a);	// 与返回值无关
```

# 面向对象

`public class` 声明的类名与文件名需一致，且可以被其他包`import`

`class` 作为启动类时可以与文件名不一致，但是编译处的`.class`文件为 class 的名字，且无法被别的包访问

`this`关键字用于指代成员变量，主要用于区分局部变量与成员变量重名问题

```java
public class Student {
	private String name;
    private int id;

    public Student (String name, int id) {
        this.name = name;
        this.id = id;
    }
}
```

# 数据结构

## String

```java
// String
char[] chs = {'a', 'b', 'c'};
String s1 = new String(chs);    // 通过new String对象创建
String s2 = new String(chs);
// new 会新申请一个内存空间

String s3 = "abc";  // 通过字面量创建字符串
String s4 = "abc";
//字符串字面量会被存储在字符串常量池中，相同内容的字符串字面量共享一个内存地址

// == 基本数据比较值，引用数据比较地址
System.out.println(s1 == s2);   // false
System.out.println(s1 == s3);   // false
System.out.println(s3 == s4);   // true
System.out.println("--------");

// .equals 比较值
System.out.println(s1.equals(s2));// true
System.out.println(s1.equals(s3));// true
System.out.println(s3.equals(s4));// true


// String 类被创建之后不可变
String s = "";
s += 'a';   // 在运行过程中新建了一个字符串对象来存储

// 访问字符串中指定索引的值, 没有 [] 访问
char c = s.charAt(index);


// StringBuilder
// 可变的字符串类型
StringBuilder str = new StringBuilder(String s1);
str.append();   // 增加
str.reverse();  // 反转


// String 与 StringBuilder 互相转换
String s = str.toString();
StringBuilder sb = new StringBuilder(s);
```

## ArrayList

```java
// 一种存储空间可变的存储模型，数组实现，长度可变
// ArrayList是一个泛型集合，它只能包含对象类型，int是基本类型无法包括，但可以包括Integer，因为Integer是包含int的对象
ArrayList<String> arr = new ArrayList<>();
arr.add(String str);     // 在末尾增加元素
arr.add(int index, String str)  // 在指定索引处增加元素
arr.remove(String str);  // 从头开始删除一个指定元素，返回是否成功
arr.remove(int index);   // 删除指定索引处的元素
arr.set(int index, String str); // 修改指定索引处的元素，返回之前的元素
arr.get(int index);      // 返回指定索引处的元素
arr.size();

ArrayList arr = new ArrayList();    // 此时可以放置任何元素
```

# 继承

Java 只支持单继承，不支持多继承，但支持多层继承

```java
public class Daddy {}
public class son extends Daddy {}
```

继承后，子类可以使用父类中非私有成员

继承中变量访问采用就近原则，首先在子类局部找，然后在子类成员找，最后在父类成员找。即在上述三个范围中变量可以重名

super: 父类对象引用

this: 子类对象引用

子类中所有构造方法默认都会访问父类中无参的构造方法，故建议在父类中给出无参构造方法

在对象的堆内存中，会单独存在一块 super 区域用于存放父类数据

## 方法重写

子类中出现和父类一样的方法声明，包括方法名和参数列表，需要通过 Override 注解（不能重写私有方法，被重写的方法权限不能比原方法权限更低）

```java
class Daddy {
    public void say (int i) {
        System.out.println("I am Daddy");
    }
}

class son extends Daddy {
    @Override
    public void say (int i) {
        System.out.println("I am son");
    }
}
```

# 修饰符

## package

## import

## 权限修饰符

public：都可以访问
protected：包内可以访问，包外子类可以访问
默认：包内可以访问
private：类内可以访问

## final

## static
