package com.gui.practise.design_model.factory.abstractfactory;

/**
 * 抽象工厂模式
 * 
 * 横向扩展容易，纵向扩展困难
 * 
 * @author wuhoujian
 *
 */
public class NvWa {

	public static void main(String[] args) {
		// 准备工厂生产男性
		HumanFactory maleFactory = HumanFactory.getInstance(MaleFactory.class);
		// 准备工厂生产女性
		HumanFactory femaleFactory = HumanFactory.getInstance(FemaleFactory.class);
		// 准备工厂生产中性
		HumanFactory neturalFactory = HumanFactory.getInstance(NeturalFactory.class);

		// 开始在每一个工厂，使用不同的生产线创建具体的人种
		System.out.println("所有男性都在这里。。。。");
		IHuman maleYellowHuman = maleFactory.createYellowHuman();
		startAction(maleYellowHuman);
		IHuman maleWhiteHuman = maleFactory.createWhiteHuman();
		startAction(maleWhiteHuman);
		IHuman maleBlackHuman = maleFactory.createBlackHuman();
		startAction(maleBlackHuman);

		System.out.println();
		System.out.println("所有女性都在这里。。。。");
		IHuman femaleYellowHuman = femaleFactory.createYellowHuman();
		startAction(femaleYellowHuman);
		IHuman femaleWhiteHuman = femaleFactory.createWhiteHuman();
		startAction(femaleWhiteHuman);
		IHuman femaleBlackHuman = femaleFactory.createBlackHuman();
		startAction(femaleBlackHuman);

		System.out.println();
		System.out.println("所有中性都在这里。。。。");
		IHuman neturalYellowHuman = neturalFactory.createYellowHuman();
		startAction(neturalYellowHuman);
	}

	/**
	 * 人开始活动
	 */
	private static void startAction(IHuman human) {
		human.getColor();
		human.talk();
		human.getSex();
	}
}
