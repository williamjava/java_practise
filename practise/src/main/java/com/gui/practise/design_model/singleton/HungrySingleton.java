package com.gui.practise.design_model.singleton;

/**
 * 饿汉式（类初始化的时候便创建类的实例）
 * 
 * 最简单的方式，线程安全。
 * 
 * 存在的问题：无论这个类是否被使用，都会创建一个实例
 * 
 * @author wuhoujian
 *
 */
public class HungrySingleton {
	// 1.系统初始化的时候，马上实例化
	private static HungrySingleton singleton = new HungrySingleton();

	// 2.私有的构造方法
	private HungrySingleton() {

	}

	// 3.公共的访问实例的方法
	public static HungrySingleton getInstance() {
		System.out.println(singleton);
		return singleton;
	}
}
