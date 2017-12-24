package com.gui.practise.design_model.singleton;

/**
 * 懒汉式增强版
 * 
 * 由于简单版本的懒汉式，同步了整个方法，会存在性能的问题，我们优化同步的地方来解决性能的问题。
 * 
 * 
 * @author wuhoujian
 *
 */
public class Singleton2st_1_Strong {
	private static Singleton2st_1_Strong singleton = null;

	private Singleton2st_1_Strong() {

	}

	/*
	 * 当实例为空的情况下，我们才使用synchronized关键字，来保证多线程环境下的数据安全
	 */
	public static Singleton2st_1_Strong getInstance() {
		if (singleton == null) {
			synchronized (Singleton2st_1_Strong.class) {
				singleton = new Singleton2st_1_Strong();
			}
		}

		return singleton;
	}
}
