package com.gui.practise.base;

public class Father {
    static {
        System.out.println("Father的静态块");
    }

    {
        System.out.println("Father的初始化块");
    }

    public Father(){
        System.out.println("Father的构造方法");
    }
}
