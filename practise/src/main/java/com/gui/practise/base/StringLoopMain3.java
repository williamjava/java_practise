package com.gui.practise.base;

/**
 * 产生一个对象，append操作都是基于原对象操作的
 */
public class StringLoopMain3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<100;i++){
            sb.append("hello");
        }
    }
}
