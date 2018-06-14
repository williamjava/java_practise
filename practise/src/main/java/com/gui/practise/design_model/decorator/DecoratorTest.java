package com.gui.practise.design_model.decorator;

/**
 * 装饰器测试类
 * 
 * 这里面真正让人迷惑的就是这个component，它最初指向ConcreteComponent对象，被装饰一次component的指向就改变一次，
 * 原始对象指向的改变导致了运行时执行了一些额外的逻辑（装饰者提供的），但是本质上它依然是一个Component类型，这是多态的妙用。
 * 
 * @author wuhoujian
 *
 */
public class DecoratorTest {

	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		component = new ConcreteDecoratorOne(component);
		component = new ConcreteDecoratorTwo(component);

		component.operate();
	}

}
