package com.gui.practise.design_model.factory.factorymethod1.ext1;

import com.gui.practise.design_model.factory.factorymethod1.BlackHuman;
import com.gui.practise.design_model.factory.factorymethod1.WhiteHuman;
import com.gui.practise.design_model.factory.factorymethod1.YellowHuman;

/**
 * 工厂方法模式
 * 
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。
 * 
 * @author wuhoujian
 *
 */
public class NvWa {

	public static void main(String[] args) {
		System.out.println("女娲开始创建黄种人了。。。。");
		YellowHuman yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();

		System.out.println("女娲开始创建白种人了。。。");
		WhiteHuman whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();

		System.out.println("女娲开始创建黑种人了。。。");
		BlackHuman blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
	}

}
