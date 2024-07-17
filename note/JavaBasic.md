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

`class` 作为启动类时可以与文件名不一致，但是编译处的`.class`文件为class的名字，且无法被别的包访问

`this`关键字用于指代成员变量，主要用于区分局部变量与成员变量重名问题

```java
public class Student {
	private String name;
	
	public void setName(String name) {
		this.name = name;
		return;
	}
}
```


