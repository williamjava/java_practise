package com.gui.practise.design_model.decorator;

/**
 * 具体的装饰器two
 * 
 * @author wuhoujian
 *
 */
public class ConcreteDecoratorTwo extends Decorator {
	public ConcreteDecoratorTwo(Component component) {
		super(component);
	}

	/**
	 * 该方法用来装饰别人的行为
	 */
	private void decorate() {
		System.out.println("decorating comes from ConcreteDecoratorTwo...");
	}

	@Override
	public void operate() {
		super.operate();
		this.decorate();
	}
}
