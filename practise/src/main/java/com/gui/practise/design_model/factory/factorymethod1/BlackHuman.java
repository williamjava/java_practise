package com.gui.practise.design_model.factory.factorymethod1;

/**
 * 具体产品角色 - 黑种人
 * 
 * @author wuhoujian
 *
 */
public class BlackHuman implements IHuman {

	public void getColor() {
		System.out.println("黑种人的肤色是黑色的。。。");
	}

	public void talk() {
		System.out.println("黑种人在说话。。。");
	}
}
