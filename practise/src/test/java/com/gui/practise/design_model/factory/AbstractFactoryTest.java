package com.gui.practise.design_model.factory;

import com.gui.practise.design_model.factory.abstractfactory.AbstractFactory;

import junit.framework.TestCase;

public class AbstractFactoryTest extends TestCase {
	public void testAbstractFactoryCreator() {
		String className = "com.gui.practise.design_model.factory.abstractfactory.SimpleAFactory";

		try {
			AbstractFactory simpleAFactory = AbstractFactory.getInstance(className);
			simpleAFactory.creator();
			simpleAFactory.creator("我的抽象产品A...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
