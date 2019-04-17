package com.gui.practise.concurrent.lock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest implements Runnable {
    public static ReentrantLock lock = new ReentrantLock();
    public static int i = 0;

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockTest test = new ReentrantLockTest();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(i);
    }

    @Override
    public void run() {
        for (int j = 0; j < 10000000; j++) {
            lock.lock();

            try {
                i++;
            } finally {
                lock.unlock();
            }
        }
    }
}
