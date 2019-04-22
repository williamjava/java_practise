package com.gui.practise.map;

import java.util.Hashtable;

/**
 * Hashtable测试类
 *
 * 线程安全，每个方法都有synchronized关键字修饰
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<String, Object> hashtable = new Hashtable<>();
        hashtable.put("name", "WuHoujian");
        hashtable.put("age", 28);
        hashtable.put("city", "Hangzhou");
        hashtable.put("job", "Engineer");
        hashtable.values().stream().forEach(v -> {
            System.out.println(v);
        });
    }
}
