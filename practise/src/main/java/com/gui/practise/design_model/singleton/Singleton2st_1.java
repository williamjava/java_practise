package com.gui.practise.design_model.singleton;

/**
 * 懒汉式
 * 
 * @author wuhoujian
 *
 */
public class Singleton2st_1 {
	private static Singleton2st_1 singleton = null;

	private Singleton2st_1() {

	}

	public synchronized static Singleton2st_1 getInstance() {
		if (singleton == null) {
			singleton = new Singleton2st_1();
		}

		return singleton;
	}
}
