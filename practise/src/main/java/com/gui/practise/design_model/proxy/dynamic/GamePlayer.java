package com.gui.practise.design_model.proxy.dynamic;

/**
 * 游戏玩家实现类，开始打游戏
 * 
 * @author wuhoujian
 *
 */
public class GamePlayer implements IGamePlayer {
	private String name;

	public GamePlayer(String name) {
		this.name = name;
	}

	/**
	 * 开始登录
	 */
	public void login(String username, String password) {
		System.out.println("登录名为" + username + "的用户" + name + "登录游戏成功。。。");
	}

	/**
	 * 开始打怪
	 */
	public void killBoss() {
		System.out.println(this.name + "在打怪。。。");
	}

	/**
	 * 开始升级
	 */
	public void upgrade() {
		System.out.println(this.name + "又升了一级。。。");
	}

}
