package com.gui.practise.design_model.templatemethod;

/**
 * 悍马抽象类
 * 
 * @author wuhoujian
 *
 */
public abstract class HummerModel {
	protected abstract void start();// 启动

	protected abstract void engineBoom();// 引擎发出轰鸣声

	protected abstract void alarm();// 鸣喇叭

	protected abstract void stop();// 停止

	/**
	 * 汽车跑起来
	 * 
	 * 这个方法就是模版方法的体现
	 */
	void run() {
		this.start();
		this.engineBoom();
		this.alarm();
		this.stop();
	}
}
