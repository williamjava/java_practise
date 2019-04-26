package com.gui.practise.thread;

public class ThreadTest {
    public static void main(String[] args) {
        new ThreadWait().start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new ThreadSleep()).start();
    }
}
