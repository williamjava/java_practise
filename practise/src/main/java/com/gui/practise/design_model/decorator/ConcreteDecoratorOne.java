package com.gui.practise.design_model.decorator;

/**
 * 具体的装饰器one
 * 
 * 把最核心、最原始的、最基本的东西装饰成其它东西。
 * 
 * @author wuhoujian
 *
 */
public class ConcreteDecoratorOne extends Decorator {
	public ConcreteDecoratorOne(Component component) {
		super(component);
	}

	/**
	 * 该方法用来装饰别人的行为
	 */
	private void decorate() {
		System.out.println("decorating comes from ConcreteDecoratorOne...");
	}

	@Override
	public void operate() {
		this.decorate();
		super.operate();
	}

}
