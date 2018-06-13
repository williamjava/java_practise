package com.gui.practise.design_model.singleton;

/**
 * 采用内部类
 * 
 * 一种简单直接的方式，适用于任何JDK版本
 * 
 * 
 * @author wuhoujian
 *
 */
public class SingletonWithInnerClass {
	/*
	 * 内部类，初始化类SingletonWithInnerClass的实例
	 */
	private static class LazyHolder {
		private static final SingletonWithInnerClass instance = new SingletonWithInnerClass();
	}

	public static SingletonWithInnerClass getInstance() {
		return LazyHolder.instance;
	}

	/*
	 * 构造方法私有化，防止直接对该类进行初始化
	 */
	private SingletonWithInnerClass() {

	}
}
