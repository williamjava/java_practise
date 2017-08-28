package com.gui.practise.design_model.proxy.ext2;

/**
 * 游戏玩家实现类，开始打游戏
 * 
 * @author wuhoujian
 *
 */
public class GamePlayer implements IGamePlayer {
	private String name;
	private IGamePlayer proxy = null;

	/**
	 * 构造函数限制谁能创建对象
	 * 
	 * @param name
	 */
	public GamePlayer(String name) {
		this.name = name;
	}

	/**
	 * 开始登录
	 */
	public void login(String username, String password) {
		if (this.isProxy()) {
			System.out.println("登录名为" + username + "的用户" + name + "登录游戏成功。。。");
		} else {
			System.out.println("请使用指定代理访问。。。");
		}
	}

	/**
	 * 开始打怪
	 */
	public void killBoss() {
		if (this.isProxy()) {
			System.out.println(this.name + "在打怪。。。");
		} else {
			System.out.println("请使用指定代理访问。。。");
		}
	}

	/**
	 * 开始升级
	 */
	public void upgrade() {
		if (this.isProxy()) {
			System.out.println(this.name + "又升了一级。。。");
		} else {
			System.out.println("请使用指定代理访问。。。");
		}
	}

	/**
	 * 指定代理
	 */
	public IGamePlayer getProxy() {
		this.proxy = new GamePlayerProxy(this);
		return this.proxy;
	}

	private boolean isProxy() {
		if (this.proxy == null) {
			return false;
		} else {
			return true;
		}
	}

}
