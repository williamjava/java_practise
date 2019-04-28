package com.gui.practise.map;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        //getEntries(map);

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            //getEntries(map);
            //System.out.println("value: " + entry.getValue());
            System.out.println("666666");
        }
    }

    private static void getEntries(HashMap<String, Object> map) {
        Set<Map.Entry<String, String>> entries = null;
        try {
            Field field = map.getClass().getDeclaredField("entrySet");
            field.setAccessible(true);
            entries = (Set<Map.Entry<String, String>>)field.get(map);
            System.out.println("entries:" + entries);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
