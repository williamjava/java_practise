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
public class Singleton3st {
	/*
	 * 内部类，初始化类Singleton3st的实例
	 */
	private static class SingletonInnerClass {
		private static final Singleton3st instance = new Singleton3st();
	}

	public static Singleton3st getInstance() {
		return SingletonInnerClass.instance;
	}

	/*
	 * 构造方法私有化，防止直接对该类进行初始化
	 */
	private Singleton3st() {

	}
}
