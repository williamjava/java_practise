package com.gui.practise.design_model.singleton;

public class NotSafetySingletonTest {

	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
			new NotSatefyThread("线程" + i).start();
		}
	}
}
