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
	// 定义最多能产生的实例数量
	private static Integer maxNumOfEmperor = 2;

	// 皇帝的名称列表
	private static List<String> nameList = new ArrayList<String>();

	// 皇帝的实例列表
	private static List<EmperorWithMaxNum> emperorList = new ArrayList<EmperorWithMaxNum>();

	// 皇帝的序号
	private static Integer countNumOfEmperor = 0;

	// 在静态代码块中产生所有的皇帝对象
	static {
		for (int i = 0; i < maxNumOfEmperor; i++) {
			emperorList.add(new EmperorWithMaxNum("King_" + i));
		}
	}

	// 构造函数私有化
	private EmperorWithMaxNum() {

	}

	// 设置皇帝的名称
	private EmperorWithMaxNum(String name) {
		nameList.add(name);
	}

	// 提供公有方法供外部访问
	public static EmperorWithMaxNum getInstance() {
		Random rand = new Random();
		countNumOfEmperor = rand.nextInt(maxNumOfEmperor);
		return emperorList.get(countNumOfEmperor);
	}

	public void say() {
		System.out.println("我是皇帝" + nameList.get(countNumOfEmperor));
	}
}
