package com.gui.practise.design_model.singleton;

/**
 * 懒汉式
 * 
 * 线程安全，解决了懒汉式存在的问题；不过这种在方法上使用synchronized关键字会lock整个方法，当方法有比较多逻辑处理的时候，会存在性能问题。
 * 
 * @author wuhoujian
 *
 */
public class Singleton2st_1 {
	private static Singleton2st_1 singleton = null;

	private Singleton2st_1() {

	}

	/*
	 * 通过给方法添加synchronized关键字，来保证多线程环境下的数据安全
	 */
	public synchronized static Singleton2st_1 getInstance() {
		if (singleton == null) {
			singleton = new Singleton2st_1();
		}

		return singleton;
	}
}
