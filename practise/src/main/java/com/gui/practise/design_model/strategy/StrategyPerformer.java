package com.gui.practise.design_model.strategy;

/**
 * 具体策略执行
 * 
 * @author wuhoujian
 *
 */
public class StrategyPerformer {

	public static void main(String[] args) {
		// 执行第一个策略
		new StrategyContext(new FirstStragetry()).operate();

		// 执行第二个策略
		new StrategyContext(new SecondStrategy()).operate();

		// 执行第三个策略
		new StrategyContext(new ThirdStrategy()).operate();
	}

}
