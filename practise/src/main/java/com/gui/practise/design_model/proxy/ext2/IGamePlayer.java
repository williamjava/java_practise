package com.gui.practise.design_model.proxy.ext2;

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

	IGamePlayer getProxy();// 每个人都可以找一下自己的代理
}
