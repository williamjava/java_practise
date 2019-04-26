package com.gui.practise.base;

/**
 * 重写 - 测试类
 */
public class ABTest {
    public static void main(String[] args) {
        B b = new B();
        b.method1();
        b.method2();

        String num = "1,234.57";
        System.out.println(Double.valueOf(num.replace(",","")));
    }
}
