package com.gui.practise.base;

/**
 * 重载 - 测试类
 */
public class CTest {
    public static void main(String[] args) {
        C c = new C();
        c.method();
        c.method("william");
        c.method("william", 28);
        c.method(28, "william");
    }
}
