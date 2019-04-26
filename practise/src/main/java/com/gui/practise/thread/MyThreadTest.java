package com.gui.practise.thread;

public class MyThreadTest {
    public static void main(String[] args) {
        //线程出于新建状态(NEW)
        MyThread myThread = new MyThread();

        //调用run方法，这里其实是主线程发起的调用，run方法就是一个普通的方法
        myThread.run();

        //调用start方法之后，线程才会变为运行的状态(RUNNABLE)
        myThread.start();

        //调用2次start会怎么样？会抛出IllegalThreadStateException异常，只有在线程状态是NEW的时候才能调用start方法，真正运行线程
        //myThread.start();
    }
}
