package com.gui.practise.design_model.singleton;

/**
 * 懒汉式
 * 
 * 线程安全(对代码块进行lock，一种更好的方式)
 * 
 * @author wuhoujian
 *
 */
public class SingletonWithLock {
	private static SingletonWithLock singleton = null;
	private static Object lock = new Object();

	private SingletonWithLock() {

	}

	public static SingletonWithLock getInstance() {
		// 可处理其他业务逻辑

		synchronized (lock) {
			System.out.println("当前线程名称为：" + Thread.currentThread().getName());

			if (singleton == null) {
				singleton = new SingletonWithLock();
			}

			System.out.println(singleton);
		}

		// 可处理其他业务逻辑

		return singleton;
	}
}
