package com.gui.practise.base;

/**
 * 非线程安全
 *
 * StringBuilder继承了抽象类AbstractStringBuilder
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("name: wuhoujian,").append("age:28,").append("job:engineer");

        System.out.println(sb);
    }
}
