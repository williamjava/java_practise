package com.gui.practise.design_model.factory.model;

/**
 * 具体产品ProductB
 * 
 * @author wuhoujian
 *
 */
public class ProductB implements ProductI {

	@Override
	public void productName() {
		System.out.println("This is ProductB...");
	}
}
