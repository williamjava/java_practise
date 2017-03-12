package com.gui.practise.design_model.factory.abstractfactory;

import com.gui.practise.design_model.factory.model.Sample;
import com.gui.practise.design_model.factory.model.Sample2;
import com.gui.practise.design_model.factory.model.Sample2A;
import com.gui.practise.design_model.factory.model.SampleA;

/**
 * 继承了抽象工厂AbstractFactory的具体工厂：SimpleAFactory
 * 
 * @author wuhoujian
 *
 */
public class SimpleAFactory extends AbstractFactory {

	@Override
	public Sample creator() {
		System.out.println("创建抽象产品Sample的一个具体产品...");
		return new SampleA();
	}

	@Override
	public Sample2 creator(String name) {
		System.out.println("创建抽象产品Sample2的一个具体产品..." + name);
		return new Sample2A();
	}

}
