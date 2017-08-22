package com.gui.practise.design_model.factory.abstractfactory;

/**
 * 具体工厂 - 创建中性生产线
 * 
 * @author wuhoujian
 *
 */
public class NeturalFactory extends HumanFactory {

	/**
	 * 中性黄种人生产
	 */
	public IHuman createYellowHuman() {
		return new NeturalYellowHuman();
	}

	/**
	 * 中性白种人生产
	 */
	public IHuman createWhiteHuman() {
		return new NeturalWhiteHuman();
	}

	/**
	 * 中性黑种人生产
	 */
	public IHuman createBlackHuman() {
		return new NeturalBlackHuman();
	}

}
