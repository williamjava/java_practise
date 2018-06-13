package com.gui.practise.design_model.singleton;

/**
 * 采用静态代码块
 * 
 * 
 * @author wuhoujian
 *
 */
public class SingletonWithStaticBlock {
	private static SingletonWithStaticBlock instance = null;

	// 使用静态代码块
	static {
		instance = new SingletonWithStaticBlock();
	}

	/*
	 * 构造方法私有化，防止直接对该类进行初始化
	 */
	private SingletonWithStaticBlock() {

	}

	public static SingletonWithStaticBlock getInstance() {
		return instance;
	}
}
