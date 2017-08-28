package com.gui.practise.design_model.proxy.dynamic;

/**
 * 由代理人员具体玩家玩游戏
 * 
 * 为其他对象提供一种代理以控制对这个对象的访问
 * 
 * @author wuhoujian
 *
 */
public class DynamicProxyClient {

	public static void main(String[] args) {
		// 定义一个玩家
		IGamePlayer gamePlayer = new GamePlayer("威廉王子");

		// 定义一个Hanlder
		// InvocationHandler handler = new GamePlayIH(gamePlayer);
		System.out.println("游戏开始时间：" + System.currentTimeMillis());
		// 获取类的class loader
		// ClassLoader cl = gamePlayer.getClass().getClassLoader();
		// 动态产生一个代理者
		// IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new
		// Class[] { IGamePlayer.class }, handler);
		// proxy.login("william", "111111");
		// proxy.killBoss();
		// proxy.upgrade();

		// 使用通用代理类
		IGamePlayer proxy = DynamicProxy.newProxyInstance(gamePlayer);
		proxy.login("william", "111111");
		proxy.killBoss();
		proxy.upgrade();

		System.out.println("游戏结束时间：" + System.currentTimeMillis());

	}

}
