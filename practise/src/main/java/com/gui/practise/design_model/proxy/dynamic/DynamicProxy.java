package com.gui.practise.design_model.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy {
	@SuppressWarnings("unchecked")
	public static <T> T newProxyInstance(IGamePlayer gamePlayer) {
		// 获得class loader
		ClassLoader loader = gamePlayer.getClass().getClassLoader();
		// 获得接口数组
		Class<?>[] interfaces = gamePlayer.getClass().getInterfaces();
		// 获得handler
		InvocationHandler handler = new GamePlayIH(gamePlayer);

		return (T) newProxyInstance(loader, interfaces, handler);
	}

	@SuppressWarnings("unchecked")
	private static <T> T newProxyInstance(ClassLoader cl, Class<?>[] interfaces, InvocationHandler handler) {
		return (T) Proxy.newProxyInstance(cl, interfaces, handler);
	}
}
