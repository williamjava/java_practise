package com.gui.practise.base;

public class BTest {
    public static BTest t1 = new BTest();
    public static BTest t2 = new BTest();

    {
        System.out.println("构造块");
    }

    static {
        System.out.println("静态块");
    }

    public BTest(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        BTest t = new BTest();
    }
}