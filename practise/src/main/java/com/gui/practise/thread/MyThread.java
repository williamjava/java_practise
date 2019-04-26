package com.gui.practise.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is calling method run...");
        System.out.println("The state of current thread is :" + this.getState().name());
    }
}
