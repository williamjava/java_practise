package com.gui.practise.design_model.singleton;

/**
 * 基于懒汉式实现的更好的线程安全实现
 * 
 * 由于简单版本的懒汉式，同步了整个方法，会存在性能的问题，我们优化同步的地方来解决性能的问题。
 * 
 * 
 * @author wuhoujian
 *
 */
public class BetterSafeLaySingleton {
	private static BetterSafeLaySingleton singleton = null;

	private BetterSafeLaySingleton() {

	}

	public static BetterSafeLaySingleton getInstance() {
		// 通过synchronized关键字实现线程安全，该方式只会锁住部分代码块。核心思想：只锁该锁的内容。
		if (singleton == null) {
			synchronized (singleton) {
				singleton = new BetterSafeLaySingleton();
			}
		}

		return singleton;
	}
}
