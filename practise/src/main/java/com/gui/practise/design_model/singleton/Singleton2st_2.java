package com.gui.practise.design_model.singleton;

/**
 * 懒汉式
 * 
 * @author wuhoujian
 *
 */
public class Singleton2st_2 {
	private static Singleton2st_2 singleton = null;

	private Singleton2st_2() {

	}

	public static Singleton2st_2 getInstance() {
		synchronized (Singleton2st_2.class) {
			if (singleton == null) {
				singleton = new Singleton2st_2();
			}
		}

		return singleton;
	}
}
