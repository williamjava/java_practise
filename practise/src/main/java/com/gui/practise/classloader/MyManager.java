package com.gui.practise.classloader;

/**
 * BaseManager的子类，需要实现java类的热加载功能
 * 
 * @author wuhoujian
 *
 */
public class MyManager implements BaseManager {
	@Override
	public void logic() {
		System.out.println("I'm learning java hot load.");
		System.out.println("It's awesome!It's awesome!");
	}
}
