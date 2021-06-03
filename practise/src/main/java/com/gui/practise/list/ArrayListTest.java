package com.gui.practise.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<Long> list1 = new ArrayList<Long>();
		list1.add(1L);
		list1.add(2L);
		list1.add(3L);
		list1.add(4L);
		list1.add(5L);

		List<Long> list2 = new ArrayList<Long>();
		list2.add(2L);
		list2.add(3L);
		list2.add(5L);
		list2.add(6L);
		list2.add(7L);

		// list1.addAll(list2);//并集
		// list1.retainAll(list2);// 交集
		//list1.removeAll(list2);// 差集

		iterateList(list1);
		iterateList(list2);
		
		Object obj = 124;
		
		System.out.println(obj instanceof List);
	}

	private static void iterateList(List<Long> list) {
		for (Long obj : list) {
			System.out.println(obj);
		}

		System.out.println("End....");
	}
}
