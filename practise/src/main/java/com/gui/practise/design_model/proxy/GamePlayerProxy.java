package com.gui.practise.design_model.proxy;

/**
 * 代理类 - 代理每一个游戏玩家玩游戏
 * 
 * @author wuhoujian
 *
 */
public class GamePlayerProxy implements IGamePlayer {
	private IGamePlayer gamePlayer = null;// 代理的对象

	public GamePlayerProxy(IGamePlayer gamePlayer) {
		this.gamePlayer = gamePlayer;
	}

	public void login(String username, String password) {
		this.gamePlayer.login(username, password);
	}

	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	public void upgrade() {
		this.gamePlayer.upgrade();
	}

	/**
	 * 开始玩游戏
	 */
	public void play(String username, String password) {
		before();
		this.gamePlayer.login(username, password);
		this.gamePlayer.killBoss();
		this.gamePlayer.upgrade();
		after();
	}

	/**
	 * 代理前的预处理
	 */
	private void before() {
		System.out.println("这里开始预处理。。。");
	}

	/**
	 * 这里开始善后处理
	 */
	private void after() {
		System.out.println("这里开始善后处理。。。");
	}

}
