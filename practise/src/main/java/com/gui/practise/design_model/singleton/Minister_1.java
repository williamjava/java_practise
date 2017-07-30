package com.gui.practise.design_model.singleton;

public class Minister_1 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Emperor_1 emperor = Emperor_1.getInstance();
			emperor.say();
		}
	}

}
