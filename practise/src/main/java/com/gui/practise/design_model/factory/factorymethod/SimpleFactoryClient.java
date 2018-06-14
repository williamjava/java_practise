package com.gui.practise.design_model.factory.factorymethod;

/**
 * 简单工厂场景测试类
 * 
 * @author wuhoujian
 *
 */
public class SimpleFactoryClient {

	public static void main(String[] args) {
		SimpleFactory.create('A').productName();

		SimpleFactory.create('B').productName();
	}

}
