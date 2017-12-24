package com.gui.practise.design_model.singleton;

/**
 * 饿汉式（类初始化的时候便创建类的实例）
 * 
 * 最简单的方式
 * 
 * 存在的问题：无论这个类是否被使用，都会创建一个实例
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
