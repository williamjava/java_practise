package com.gui.practise.design_model.singleton;

/**
 * 饿汉式
 * 
 * 线程安全
 * 
 * @author wuhoujian
 *
 */
public class Singleton1st {
	private static Singleton1st singleton = new Singleton1st();

	private Singleton1st() {

	}

	public static Singleton1st getInstance() {
		return singleton;
	}
}
