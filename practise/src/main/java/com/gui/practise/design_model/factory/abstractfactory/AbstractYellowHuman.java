package com.gui.practise.design_model.factory.abstractfactory;

/**
 * 抽象产品-黄种人
 * 
 * @author wuhoujian
 *
 */
public abstract class AbstractYellowHuman extends IHuman {

	public void getColor() {
		System.out.println("黄种人的皮肤是黄色的。。。");
	}

	public void talk() {
		System.out.println("黄种人在说话。。。");
	}

}
