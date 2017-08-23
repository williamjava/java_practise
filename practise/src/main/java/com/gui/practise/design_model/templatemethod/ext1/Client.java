package com.gui.practise.design_model.templatemethod.ext1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 模板方法模式
 * 
 * 定义一个算法框架
 * 
 * 将具体的步骤延迟到子类中
 * 
 * 优点：封装不变部分，扩展可变部分；行为由父类控制，子类实现；提取公共部分代码，便于维护。
 * 
 * 
 * 
 * @author wuhoujian
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		System.out.println("====H1型号的悍马，喇叭可人为控制=====");
		System.out.println("请问您需要喇叭吗？(y/n)");
		String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		HummerH1Model h1Model = new HummerH1Model();
		if ("y".equals(type)) {
			h1Model.setAlarm(true);
		} else if ("n".equals(type)) {
			h1Model.setAlarm(false);
		} else {
			System.out.println("输入错误。。。。");
			System.exit(0);
		}

		h1Model.run();

		System.out.println();

		HummerH2Model h2Model = new HummerH2Model();
		h2Model.run();
	}

}
