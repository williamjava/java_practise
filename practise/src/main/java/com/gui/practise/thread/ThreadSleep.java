package com.gui.practise.thread;

/**
 * 第二种创建线程的方式，实现Runnable接口
 */
public class ThreadSleep implements Runnable {
    @Override
    public void run() {
        synchronized (ThreadTest.class) {
            System.out.println("ThreadSleep start...");
            System.out.println("ThreadSleep sleeping");

            //只有针对此对象调用notify()方法后本线程才进入对象锁定池准备获取对象锁进入运行状态。
            //ThreadTest.class.notify();

            try {
                //sleep()方法导致了程序暂停执行指定的时间，让出cpu该其他线程，但是他的监控状态依然保持者，当指定的时间到了又会自动恢复运行状态。在调用sleep()方法的过程中，线程不会释放对象锁。
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("ThreadSleep continue...");

            System.out.println("ThreadSleep end...");
        }
    }
}
