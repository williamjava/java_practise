package com.gui.practise.base;

/**
 * 会产生100个String对象
 */
public class StringLoopMain1 {
    public static void main(String[] args) {
        String s = "";
        for(int i=0;i<100;i++){
            s += "hello";
        }
    }
}
