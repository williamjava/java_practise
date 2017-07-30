package com.gui.practise.design_model.singleton;

/**
 * 懒汉式
 * 
 * @author wuhoujian
 *
 */
public class Singleton2st {
	private static Singleton2st singleton = null;

	private Singleton2st() {

	}

	public static Singleton2st getInstance() {
		if (singleton == null) {
			singleton = new Singleton2st();
		}

		return singleton;
	}
}
