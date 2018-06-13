package com.gui.practise.design_model.singleton;

public class SatefyThread extends Thread {
	public SatefyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		SingletonWithLock.getInstance();
	}
}
