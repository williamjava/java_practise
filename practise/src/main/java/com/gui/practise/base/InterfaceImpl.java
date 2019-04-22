package com.gui.practise.base;

/**
 * 必须实现接口中定义的所有方法
 */
public class InterfaceImpl implements InterfaceTest {
    @Override
    public void ask() {
        System.out.println("this is impl for ask...");
    }

    @Override
    public void answer() {
        System.out.println("this is impl for answer...");
    }
}
