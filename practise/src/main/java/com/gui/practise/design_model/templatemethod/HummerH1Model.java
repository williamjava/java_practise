package com.gui.practise.design_model.templatemethod;

/**
 * 悍马实现类-型号H1
 * 
 * @author wuhoujian
 *
 */
public class HummerH1Model extends HummerModel {

	@Override
	protected void start() {
		System.out.println("H1启动。。。");
	}

	@Override
	protected void engineBoom() {
		System.out.println("H1引擎发出轰鸣声。。。");
	}

	@Override
	protected void alarm() {
		System.out.println("H1喇叭响了。。。");
	}

	@Override
	protected void stop() {
		System.out.println("H1停止。。。");
	}
}
