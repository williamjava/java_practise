package com.gui.practise.design_model.proxy;

/**
 * 具体玩家玩游戏
 * 
 * @author wuhoujian
 *
 */
public class Client {

	public static void main(String[] args) {
		IGamePlayer gamePlayer = new GamePlayer("威廉王子");
		gamePlayer.login("william", "111111");
		gamePlayer.killBoss();
		gamePlayer.upgrade();
	}

}
