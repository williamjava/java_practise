package com.gui.practise.design_model.singleton;

public class Emperor {
	private static final Emperor emperor = new Emperor();

	private Emperor() {// 构造函数私有化

	}

	public static Emperor getInstance() {// 提供公有方法供外部访问
		return emperor;
	}

	public void say() {
		System.out.println("我是皇帝William_King...");
	}
}
