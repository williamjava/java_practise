package com.gui.practise.design_model.factory.factorymethod1;

/**
 * 具体产品角色 - 白种人
 * @author wuhoujian
 *
 */
public class WhiteHuman implements IHuman {

	public void getColor() {
		System.out.println("白种人的肤色是白色的。。。");
	}

	public void talk() {
		System.out.println("白种人在说话。。。");
	}
}
