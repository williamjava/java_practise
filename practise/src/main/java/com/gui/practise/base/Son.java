package com.gui.practise.base;

public class Son extends Father {
    static {
        System.out.println("Son的静态块");
    }

    {
        System.out.println("Son的初始化块");
    }

    public Son(){
        System.out.println("Son的构造方法");
    }
}
