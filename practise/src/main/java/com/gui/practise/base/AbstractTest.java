package com.gui.practise.base;

/**
 * 抽象类
 *
 * 使用abstract关键字修饰
 *
 * 不能被实例化，只能作为父类被具体的子类继承。
 *
 * 抽象方法：对一批类公共内容的抽象，不做任何实现。
 */
public abstract class AbstractTest {
    private String name;

    public AbstractTest(){}

    public AbstractTest(String name){
        this.name = name;
    }

    /**
     * 基本方法，如果子类不重写，该方法作为默认实现。
     */
    public void sayHi(){
        System.out.println("Hello, I'm an abstract class...");
    }

    public static void hello(){
        System.out.println("This is a static methond in an abstract class...");
    }

    public abstract void ask();//抽象方法1

    public abstract void answer();//抽象方法2
}
