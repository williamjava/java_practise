package com.gui.practise.design_model.singleton;

/**
 * 懒汉式
 * 
 * 线程不安全
 * 
 * @author wuhoujian
 *
 */
public class Singleton2st {
	private static Singleton2st singleton = null;

	private Singleton2st() {

	}

	public static Singleton2st getInstance() {
		// 可处理其他业务逻辑

		if (singleton == null) {
			System.out.println("当前线程名称为：" + Thread.currentThread().getName());

			singleton = new Singleton2st();

			System.out.println(singleton);
		}

		// 可处理其他业务逻辑

		return singleton;
	}
}
