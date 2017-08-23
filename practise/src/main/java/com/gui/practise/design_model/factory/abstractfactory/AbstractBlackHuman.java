package com.gui.practise.design_model.factory.abstractfactory;

/**
 * 抽象产品 - 黑种人
 * 
 * @author wuhoujian
 *
 */
public abstract class AbstractBlackHuman extends IHuman {

	public void getColor() {
		System.out.println("黑种人的肤色是黑色的。。。");
	}

	public void talk() {
		System.out.println("黑种人在说话。。。");
	}
}
