package com.gui.practise.design_model.proxy.ext1;

import com.gui.practise.design_model.proxy.IGamePlayer;

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
		IGamePlayer proxy = new GamePlayerProxy("威廉王子");
		proxy.login("william", "111111");
		proxy.killBoss();
		proxy.upgrade();
	}

}
