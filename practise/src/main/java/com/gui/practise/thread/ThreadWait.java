package com.gui.practise.thread;

/**
 * 第一种创建线程的方式，继承Thread类
 */
public class ThreadWait extends Thread {
    @Override
    public void run() {
        synchronized (ThreadTest.class) {
            System.out.println("ThreadWait start...");
            System.out.println("ThreadWait waiting...");

            try {
                //调用Object对象的wait方法，线程会放弃对象锁，进入等待此对象的等待锁定池
                ThreadTest.class.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("ThreadWait continue...");

            System.out.println("ThreadWait end...");
        }
    }
}
