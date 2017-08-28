package com.gui.practise.design_model.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {
	// 被代理的实例
	Object target = null;

	public GamePlayIH(Object target) {
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().equalsIgnoreCase("login")) {
			System.out.println("有人在用我的账号登录。。。速度检查是否被盗用了。。。");
		}
		return method.invoke(this.target, args);
	}

}
