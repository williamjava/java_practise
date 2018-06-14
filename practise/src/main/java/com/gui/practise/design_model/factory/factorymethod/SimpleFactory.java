package com.gui.practise.design_model.factory.factorymethod;

import com.gui.practise.design_model.factory.model.ProductA;
import com.gui.practise.design_model.factory.model.ProductB;
import com.gui.practise.design_model.factory.model.ProductI;

/**
 * 简单工厂
 * 
 * @author wuhoujian
 *
 */
public class SimpleFactory {
	public static ProductI create(char productName) {
		switch (productName) {
		case 'A':
			return new ProductA();
		case 'B':
			return new ProductB();
		default:
			return null;
		}
	}
}
