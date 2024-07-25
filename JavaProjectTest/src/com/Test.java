package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Test extends Object {
    public static void main(String[] args) throws IOException {
        SellTicket st = new SellTicket();

        //创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");

        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}

class SellTicket implements Runnable {
    private int tickets = 100;
    //在SellTicket类中重写run()方法实现卖票，代码步骤如下
    @Override
    public void run() {
        while (true) {
            sell();
        }
    }

    public synchronized void sell() {
        if (tickets > 0) {
            
            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
            tickets--;
        }
    }
}