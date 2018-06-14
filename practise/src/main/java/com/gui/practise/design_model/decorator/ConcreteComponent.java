package com.gui.practise.design_model.decorator;

/**
 * 具体构件：是最核心、最基本的接口或抽象类的实现，我们要装饰的就是它。
 * 
 * 表示一个想被别人装饰的组件
 * 
 * @author wuhoujian
 *
 */
public class ConcreteComponent implements Component {

	@Override
	public void operate() {
		System.out.println("I'm a concreteComponent, I want to be decorated.");
	}
}
