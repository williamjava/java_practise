package com.gui.practise.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		for (String str : list) {
			System.out.println(str);
		}
		
		System.out.println(Objects.equals(null, list.get(0)));
		
		System.out.println(new Date().getTime());
		
		try {
			System.exit(1);
		} finally {
			System.out.println("finally...");
		}
	}

}
