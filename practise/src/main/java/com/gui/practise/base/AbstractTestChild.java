package com.gui.practise.base;

/**
 * 实现抽象类的子类必须实现抽象类中定义的所有抽象方法
 */
public class AbstractTestChild extends AbstractTest{
    @Override
    public void ask() {
        System.out.println("Can I ask you a question?");
    }

    @Override
    public void answer() {
        System.out.println("Please give me your answer.");
    }

    /**
     * 重写抽象类中的具体方法
     */
    @Override
    public void sayHi() {
        System.out.println("Hello, I'm a child of abstract class...");
    }
}
