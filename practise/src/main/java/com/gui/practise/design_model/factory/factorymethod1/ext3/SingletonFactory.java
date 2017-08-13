package com.gui.practise.design_model.factory.factorymethod1.ext3;

import java.lang.reflect.Constructor;

/**
 * 工厂方法模式实现单例模式
 * 
 * 使用反射的方式实现
 * 
 * @author wuhoujian
 *
 */
@SuppressWarnings("rawtypes")
public class SingletonFactory {
	private static Singleton singleton = null;

	static {
		try {
			Class<?> clz = Class.forName(Singleton.class.getName());
			Constructor[] constructor = clz.getDeclaredConstructors();
			constructor[0].setAccessible(true);
			singleton = (Singleton) constructor[0].newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Singleton getSingleton() {
		return singleton;
	}
}
