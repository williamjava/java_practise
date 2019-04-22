package com.gui.practise.base;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = "hello";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

        //调用String的intern方法，将字符串放入常量池
        System.out.println(s1 == s2.intern());
    }
}
