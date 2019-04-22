package com.gui.practise.list;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		// AnimalFeedingService feedingService = new AnimalFeedingService();
		// feedingService.feed();
		
		System.out.println(new Date().getTime());
		
		String action = "供应商已出货";
		if (action.contains("出货")) {
			System.out.println("出货了。。。");
		}

		System.out.println(4 >> 1);
	}
	
}
