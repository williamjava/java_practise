package com.gui.practise.design_model.proxy;

/**
 * 由代理人员具体玩家玩游戏
 * 
 * 为其他对象提供一种代理以控制对这个对象的访问
 * 
 * @author wuhoujian
 *
 */
public class ProxyClient {

	public static void main(String[] args) {
		IGamePlayer gamePlayer = new GamePlayer("威廉王子");

		GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(gamePlayer);
		gamePlayerProxy.play("william", "111111");

		// gamePlayerProxy.login("william", "111111");
		// gamePlayerProxy.killBoss();
		// gamePlayerProxy.upgrade();
	}

}
