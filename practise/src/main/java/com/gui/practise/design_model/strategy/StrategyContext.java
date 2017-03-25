package com.gui.practise.design_model.strategy;

/**
 * 存放策略的地方，需要用的策略的时候直接调用
 * 
 * @author wuhoujian
 *
 */
public class StrategyContext {
	private IStrategy strategy;

	public StrategyContext(IStrategy strategy) {
		this.strategy = strategy;
	}

	public void operate() {
		this.strategy.operate();
	}
}
