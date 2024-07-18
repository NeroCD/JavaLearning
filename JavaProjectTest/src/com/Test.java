package com;

public class Test {
    public static void main(String[] args) throws Exception {
        Son s = new Son();
        s.say(1);
    }
}

class Daddy {
    public void say (int i) {
        System.out.println("I am Daddy");
    }
}

class Son extends Daddy {
    @Override
    public void say (int i) {
        System.out.println("I am son");
    }
}