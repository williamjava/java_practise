package com.gui.practise.base;

public class Test {

	public static void main(String[] args) {

		Double totalPrice = 10391212.00;
		Integer percent = 30;
		System.out.println(percent / 100);
		System.out.println(Math.round(totalPrice * (double) percent / (double) 100));

		System.out.println(3 / 10);

		int i = 1;
		System.out.println(i%32);
		System.out.println((i/32)%32);

		System.out.println("++++++++++++++++++");
		int x=20,y=5;
		System.out.println(x+y +""+(x+y)+y);

		String s = "hello";
		String t = "hello";
		char c[] = {'h','e','l','l','o'};
		System.out.println(t.equals(c));
	}

}
