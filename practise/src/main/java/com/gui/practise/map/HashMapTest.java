package com.gui.practise.map;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap测试类
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("name", "WuHoujian");
        map.put("age", 28);
        map.put("city", "Hangzhou");
        map.put("job", "Engineer");

        map.values().stream().forEach(v -> {
            System.out.println(v);
        });
    }
}
