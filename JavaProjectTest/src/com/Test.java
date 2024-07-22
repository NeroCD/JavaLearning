package com;

public class Test extends Object{
    public static void main(String[] args) {
        test t = new test();
        t.fun(8);
    }
}

interface Inter {
    int TIME = 1;

    void fun(int a);
}

class test implements Inter {
    @Override
    public void fun(int a) {
        System.out.println(a + TIME);
    }
}