package com.gui.practise.design_model.factory.abstractfactory;

/**
 * 具体工厂 - 创建男性的生产线
 * 
 *
 */
public class MaleFactory extends HumanFactory {

	/**
	 * 女性黄种人生产
	 */
	public IHuman createYellowHuman() {
		return new MaleYellowHuman();
	}

	/**
	 * 女性白种人生产
	 */
	public IHuman createWhiteHuman() {
		return new MaleWhiteHuman();
	}

	/**
	 * 女性黑种人生产
	 */
	public IHuman createBlackHuman() {
		return new MaleBlackHuman();
	}

}
