package com.gui.practise.design_model.proxy;

/**
 * 游戏玩家接口，每个玩家都需要做的事情
 * 
 * @author wuhoujian
 *
 */
public interface IGamePlayer {
	void login(String username, String password);// 玩家登录

	void killBoss();// 打怪

	void upgrade();// 升级
}
