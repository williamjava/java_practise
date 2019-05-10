package com.gui.practise.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatitleTest {
    private static  AtomicInteger a = new AtomicInteger(0);
    //    public static volatile int a = 0;

    public static void add() {
    //        a++;
        a.getAndIncrement();
    }

    private static final int size = 20;

    public static void main(String[] args) {
        Thread[] threads = new Thread[size];

        for (int i = 0; i < size; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        add();
                    }
                }
            });
            threads[i].start();
        }

        while (Thread.activeCount() > 1)
            Thread.yield();

        System.out.println(a);
    }
}
