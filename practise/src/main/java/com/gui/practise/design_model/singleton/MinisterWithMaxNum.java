package com.gui.practise.design_model.singleton;

public class MinisterWithMaxNum {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			EmperorWithMaxNum emperor = EmperorWithMaxNum.getInstance();
			emperor.say();
		}
	}

}
