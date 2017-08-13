package com.gui.practise.design_model.factory.factorymethod1.ext1;

import com.gui.practise.design_model.factory.factorymethod1.BlackHuman;
import com.gui.practise.design_model.factory.factorymethod1.WhiteHuman;
import com.gui.practise.design_model.factory.factorymethod1.YellowHuman;

/**
 * 缩小为简单工厂模式
 * 
 * 去掉工厂方法模式中的抽象类，简化类的创建过程
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
		
		System.out.println();

		System.out.println("女娲开始创建白种人了。。。");
		WhiteHuman whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println();

		System.out.println("女娲开始创建黑种人了。。。");
		BlackHuman blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
	}

}
