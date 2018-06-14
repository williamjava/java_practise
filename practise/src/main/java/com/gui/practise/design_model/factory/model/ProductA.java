package com.gui.practise.design_model.factory.model;

/**
 * 具体产品ProductA
 * 
 * @author wuhoujian
 *
 */
public class ProductA implements ProductI {

	@Override
	public void productName() {
		System.out.println("This is ProductA...");
	}
}
