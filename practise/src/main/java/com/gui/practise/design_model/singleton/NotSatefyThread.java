package com.gui.practise.design_model.singleton;

public class NotSatefyThread extends Thread {
	public NotSatefyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		LazySingleton.getInstance();
	}
}
