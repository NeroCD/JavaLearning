package com;

public class Test {
    public static void main(String[] args) {
        //有父类引用指向子类对象
        Animal a = new Cat();
        a.eat();
//      a.playGame();
        System.out.println(a.age);


        //向下转型
        Cat c = (Cat)a;
        c.eat();
        c.playGame();
        System.out.println(c.age);
    }
    
}

class Animal {
    public int age = 40;

    public void eat() {
        System.out.println("动物吃东西");
    }
}

class Cat extends Animal {
    public int age = 20;
    public int weight = 10;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame() {
        System.out.println("猫捉迷藏");
    }
}