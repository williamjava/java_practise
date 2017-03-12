package com.gui.practise.design_model.factory.abstractfactory;

import com.gui.practise.design_model.factory.model.Sample;
import com.gui.practise.design_model.factory.model.Sample2;

/**
 * 抽象工厂AbstractFactory，可以生产多个不同的抽象产品，我们叫它：产品簇
 * 
 * @author wuhoujian
 *
 */
public abstract class AbstractFactory {
	public abstract Sample creator();

	public abstract Sample2 creator(String name);

	/**
	 * 获取指定className对应的工厂实例
	 * 
	 * @param className
	 *            具体工厂实现的class
	 * @return AbstractFactory
	 */
	public static AbstractFactory getInstance(String className) {
		AbstractFactory factory = null;
		try {
			factory = (AbstractFactory) Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return factory;
	}
}
