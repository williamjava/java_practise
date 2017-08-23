package com.gui.practise.design_model.templatemethod;

/**
 * 悍马实现类-型号H2
 * 
 * @author wuhoujian
 *
 */
public class HummerH2Model extends HummerModel {

	@Override
	void start() {
		System.out.println("H2启动。。。");
	}

	@Override
	void engineBoom() {
		System.out.println("H2引擎发出轰鸣声。。。");
	}

	@Override
	void alarm() {
		System.out.println("H2喇叭响了。。。");
	}

	@Override
	void stop() {
		System.out.println("H2停止。。。");
	}
}
