package com.gui.practise.design_model.factory.abstractfactory;

/**
 * 具体工厂 - 创建女性生产线
 * 
 * @author wuhoujian
 *
 */
public class FemaleFactory extends HumanFactory {

	/**
	 * 男性黄种人生产
	 */
	public IHuman createYellowHuman() {
		return new FemaleYellowHuman();
	}

	/**
	 * 男性白种人生产
	 */
	public IHuman createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

	/**
	 * 男性黑种人生产
	 */
	public IHuman createBlackHuman() {
		return new FemaleBlackHuman();
	}

}
