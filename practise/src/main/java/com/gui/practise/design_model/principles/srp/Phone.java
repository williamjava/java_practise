package com.gui.practise.design_model.principles.srp;

/**
 * 单一职责原则
 * 
 * 只有一个原因引起类的变化
 * 
 * @author wuhoujian
 *
 */
public class Phone implements ConnectionManager, DataTransfer {

	public void chat() {
		System.out.println("chat...");
	}

	public void dial() {
		System.out.println("dial...");
	}

	public void hungUp() {
		System.out.println("hungup...");
	}

}
