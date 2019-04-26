package com.gui.practise.concurrent;

public class SynchronizedTest implements Runnable {
    private static int count = 0;
    public static void main(String[] args) {
        for (int i = 1;i<=5;i++) {
            Thread t = new Thread(new SynchronizedTest());
            t.start();
        }

        System.out.println("总共计数次数：" + count);
    }

    @Override
    public void run() {
        synchronized (SynchronizedTest.class) {
            for (int i = 1;i<=100;i++) {
                count ++;
            }
        }
    }
}
