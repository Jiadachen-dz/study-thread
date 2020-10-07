package com.mystudy.thread.demo;


//创建线程方式一： 继承Thread的类 ， 重写run()方法，调用start()开启线程

//总结：注意：线程开启不一定立即执行，有CPU调度执行，是交替执行的

public class TestThread1 extends Thread {
    @Override
    public void run() {
        //run()方法线程体
        for (int i = 0; i <= 200; i++) {
            System.out.println("我在看代码（子线程）：" + i);
        }
    }


    public static void main(String[] args) {
        //main线程 ，主线程

        //创建一个线程对象
        TestThread1 testThread1 = new TestThread1();
        //调用start()启动线程
        testThread1.start();

        for (int i = 0; i <= 1000; i++) {
            System.out.println("我在学习多线程（主线程）：" + i);
        }
    }
}
