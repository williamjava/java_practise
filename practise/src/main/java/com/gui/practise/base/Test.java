package com.gui.practise.base;

import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {

		Double totalPrice = 10391212.00;
		Integer percent = 30;
		System.out.println(percent / 100);
		System.out.println(Math.round(totalPrice * (double) percent / (double) 100));

		System.out.println(3 / 10);

		System.out.println(BigDecimal.ZERO);
	}

}
