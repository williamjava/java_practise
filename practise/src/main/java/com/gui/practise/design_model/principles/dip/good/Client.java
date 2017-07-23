package com.gui.practise.design_model.principles.dip.good;

/**
 * 依赖倒置原则
 * 
 * 结合面向接口编程理解
 * 
 * @author wuhoujian
 *
 */
public class Client {

	public static void main(String[] args) {
		IDriver william = new Driver();
		ICar benz = new Benz();
		ICar bmw = new BMW();
		william.drive(benz);
		william.drive(bmw);
	}

}
