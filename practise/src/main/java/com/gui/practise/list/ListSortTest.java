package com.gui.practise.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * List容器的排序
 */
public class ListSortTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(9);

        //Collections.sort(list);//默认升序

        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer s1, Integer s2) {
                return s2.compareTo(s1);//注意这里的顺序。此时是需要降序
            }
        });

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
