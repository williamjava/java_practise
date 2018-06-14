package com.gui.practise.design_model.factory.factorymethod1;

/**
 * 具体产品角色 - 黄种人
 * 
 * @author wuhoujian
 *
 */
public class YellowHuman implements IHuman {

	public void getColor() {
		System.out.println("黄种人的皮肤是黄色的。。。");
	}

	public void talk() {
		System.out.println("黄种人在说话。。。");
	}

}
