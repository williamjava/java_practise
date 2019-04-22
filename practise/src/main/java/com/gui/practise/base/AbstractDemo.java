package com.gui.practise.base;

/**
 * 抽象类测试
 */
public class AbstractDemo {
    public static void main(String[] args) {
        AbstractTestChild child = new AbstractTestChild();
        child.sayHi();
        child.ask();
        child.answer();
    }
}
