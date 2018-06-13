package com.gui.practise.design_model.singleton;

/**
 * 懒汉式
 * 
 * 线程安全，解决了懒汉式存在的问题；不过这种在方法上使用synchronized关键字会lock整个方法，当方法有比较多逻辑处理的时候，会存在性能问题。
 * 
 * @author wuhoujian
 *
 */
public class SimpleSafeLaySingleton {
	private static SimpleSafeLaySingleton singleton = null;

	private SimpleSafeLaySingleton() {

	}

	/*
	 * 通过给方法添加synchronized关键字，来保证多线程环境下的数据安全。由于该方式会锁住整个方法，性能不好。
	 */
	public synchronized static SimpleSafeLaySingleton getInstance() {
		if (singleton == null) {
			singleton = new SimpleSafeLaySingleton();
		}

		return singleton;
	}
}
