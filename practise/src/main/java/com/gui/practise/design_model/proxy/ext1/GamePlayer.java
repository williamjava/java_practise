package com.gui.practise.design_model.proxy.ext1;

import com.gui.practise.design_model.proxy.IGamePlayer;

/**
 * 游戏玩家实现类，开始打游戏
 * 
 * @author wuhoujian
 *
 */
public class GamePlayer implements IGamePlayer {
	private String name;

	/**
	 * 构造函数限制谁能创建对象
	 * 
	 * @param name
	 */
	public GamePlayer(IGamePlayer gamePlayer, String name) throws Exception{
		if (gamePlayer == null) {
			throw new Exception("不能创建真实角色！");
		} else {
			this.name = name;
		}
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
