package com.gui.practise.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程测试类
 */
public class ThreadCreateTest {
    public static void main(String[] args) {
        new ThreadWait().start();

        new Thread(new ThreadSleep()).start();

        FutureTask futureTask = new FutureTask(new ThreadCallable());
        new Thread(futureTask).start();
        try {
            System.out.println("线程返回结果：" + futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
