package com.gui.practise.base;

/**
 * 线程安全，每个方法上面增加了synchronized关键字
 *
 * StringBuffer继承了抽象类AbstractStringBuilder
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("name: wuhoujian,").append("age:28,").append("job:engineer");

        System.out.println(sb);
    }
}
