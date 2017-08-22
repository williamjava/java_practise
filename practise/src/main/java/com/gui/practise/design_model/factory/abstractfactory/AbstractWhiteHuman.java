package com.gui.practise.design_model.factory.abstractfactory;

/**
 * 抽象产品-白种人
 * 
 * @author wuhoujian
 *
 */
public abstract class AbstractWhiteHuman implements IHuman {

	public void getColor() {
		System.out.println("白种人的肤色是白色的。。。");
	}

	public void talk() {
		System.out.println("白种人在说话。。。");
	}
}
