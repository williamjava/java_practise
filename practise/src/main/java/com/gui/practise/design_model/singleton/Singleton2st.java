package com.gui.practise.design_model.singleton;

/**
 * 懒汉式
 * 
 * 延迟加载，需要的时候才进行实例的创建，解决饿汉式存在的问题。
 * 
 * 存在的问题：该方式在单线程的情况不会有问题，如果式多线程环境，就会出现线程不安全的问题。
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
