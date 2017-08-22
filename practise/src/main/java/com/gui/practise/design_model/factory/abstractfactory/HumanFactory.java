package com.gui.practise.design_model.factory.abstractfactory;

/**
 * 抽象工厂
 * 
 * @author wuhoujian
 *
 */
public abstract class HumanFactory {
	abstract IHuman createYellowHuman();

	abstract IHuman createWhiteHuman();

	abstract IHuman createBlackHuman();

	/**
	 * 获取指定concreteFactoryClass对应的工厂实例
	 * 
	 * @param className
	 *            具体工厂实现的class
	 * 
	 * @return HumanFactory
	 */
	public static <T> HumanFactory getInstance(Class<T> concreteFactoryClass) {
		HumanFactory factory = null;
		try {
			factory = (HumanFactory) concreteFactoryClass.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return factory;
	}
}
