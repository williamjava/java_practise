package com.gui.practise.design_model.templatemethod;

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

	public static void main(String[] args) {
		HummerModel h1Model = new HummerH1Model();
		h1Model.run();

		System.out.println();

		HummerModel h2Model = new HummerH2Model();
		h2Model.run();
	}

}
