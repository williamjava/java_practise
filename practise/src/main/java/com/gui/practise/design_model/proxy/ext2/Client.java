package com.gui.practise.design_model.proxy.ext2;

/**
 * 由代理人员具体玩家玩游戏
 * 
 * 为其他对象提供一种代理以控制对这个对象的访问
 * 
 * @author wuhoujian
 *
 */
public class Client {

	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("威廉王子");// 直接访问不行
		// IGamePlayer proxy = new GamePlayerProxy2(player);//随便使用一个代理不行

		IGamePlayer proxy = player.getProxy();
		proxy.login("william", "111111");
		proxy.killBoss();
		proxy.upgrade();
	}

}
