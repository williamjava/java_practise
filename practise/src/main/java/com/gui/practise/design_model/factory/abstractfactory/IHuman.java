package com.gui.practise.design_model.factory.abstractfactory;

public abstract class IHuman {
	abstract void getColor();

	abstract void talk();

	abstract void getSex();

	/**
	 * 人类开始活动
	 */
	void startAction() {
		this.getSex();
		this.getColor();
		this.talk();
	}
}
