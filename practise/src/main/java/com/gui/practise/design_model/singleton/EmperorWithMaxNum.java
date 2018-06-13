package com.gui.practise.design_model.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 有上限的多例模式
 * 
 * @author wuhoujian
 *
 */
public class EmperorWithMaxNum {
	private static Integer maxNumOfEmperor = 2;
	private static List<String> nameList = new ArrayList<String>();
	private static List<EmperorWithMaxNum> emperorList = new ArrayList<EmperorWithMaxNum>();
	private static Integer countNumOfEmperor = 0;

	static {
		for (int i = 0; i < maxNumOfEmperor; i++) {
			emperorList.add(new EmperorWithMaxNum("King_" + i));
		}
	}

	private EmperorWithMaxNum() {// 构造函数私有化

	}

	private EmperorWithMaxNum(String name) {
		nameList.add(name);
	}

	public static EmperorWithMaxNum getInstance() {// 提供公有方法供外部访问
		Random rand = new Random();
		countNumOfEmperor = rand.nextInt(maxNumOfEmperor);
		return emperorList.get(countNumOfEmperor);
	}

	public void say() {
		System.out.println("我是皇帝" + nameList.get(countNumOfEmperor));
	}
}
