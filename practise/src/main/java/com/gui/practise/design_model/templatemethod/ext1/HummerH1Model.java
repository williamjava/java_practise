package com.gui.practise.design_model.templatemethod.ext1;

/**
 * 悍马实现类-型号H1
 * 
 * 喇叭可认为控制
 * 
 * @author wuhoujian
 *
 */
public class HummerH1Model extends HummerModel {
	private boolean alarmFlag = true;

	@Override
	void start() {
		System.out.println("H1启动。。。");
	}

	@Override
	void engineBoom() {
		System.out.println("H1引擎发出轰鸣声。。。");
	}

	@Override
	void alarm() {
		System.out.println("H1喇叭响了。。。");
	}

	@Override
	void stop() {
		System.out.println("H1停止。。。");
	}

	@Override
	boolean isAlarm() {
		return this.alarmFlag;
	}

	public void setAlarm(boolean isAlarm) {
		this.alarmFlag = isAlarm;
	}
}
