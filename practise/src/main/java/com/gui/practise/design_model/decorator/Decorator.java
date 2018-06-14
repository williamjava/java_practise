package com.gui.practise.design_model.decorator;

/**
 * 抽象装饰角色
 * 
 * 用一个抽象类表示，实现抽象构件Component，但它是用来装饰别人的
 * 
 * @author wuhoujian
 *
 */
public abstract class Decorator implements Component {
	//指向抽象构件
	private Component component;

	/**
	 * 传入的component表示一个想被别人装饰的构件（具体构件）
	 * 
	 * @param component
	 */
	public Decorator(Component component) {
		this.component = component;
	}

	/**
	 * 被装饰构件的原始方法
	 */
	@Override
	public void operate() {
		this.component.operate();
	}
}
