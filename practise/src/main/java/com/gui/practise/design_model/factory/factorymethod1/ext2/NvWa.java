package com.gui.practise.design_model.factory.factorymethod1.ext2;

import com.gui.practise.design_model.factory.factorymethod1.IHuman;

/**
 * 工厂方法模式升级为多个工厂类
 * 
 * @author wuhoujian
 *
 */
public class NvWa {

	public static void main(String[] args) {

		System.out.println("女娲开始创建黄种人了。。。。");
		IHuman yellowHuman = (new YellowHumanFactory()).createHuman();
		yellowHuman.getColor();
		yellowHuman.talk();

		System.out.println();

		System.out.println("女娲开始创建白种人了。。。");
		IHuman whiteHuman = (new WhiteHumanFactory()).createHuman();
		whiteHuman.getColor();
		whiteHuman.talk();

		System.out.println();

		System.out.println("女娲开始创建黑种人了。。。");
		IHuman blackHuman = (new BlackHumanFactory()).createHuman();
		blackHuman.getColor();
		blackHuman.talk();
	}

}
