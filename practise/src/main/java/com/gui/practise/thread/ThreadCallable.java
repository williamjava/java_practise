package com.gui.practise.thread;

import java.util.concurrent.Callable;

/**
 * 第三种创建Thread的方法，实现Callable接口
 */
public class ThreadCallable implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("begin...");
        return "1";
    }
}
