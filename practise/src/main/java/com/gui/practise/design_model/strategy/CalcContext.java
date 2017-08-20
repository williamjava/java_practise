package com.gui.practise.design_model.strategy;

/**
 * 存放策略的地方，需要用的策略的时候直接调用
 * 
 * @author wuhoujian
 *
 */
public class CalcContext {
	private ICalculator calculator;

	public CalcContext(ICalculator calculator) {
		this.calculator = calculator;
	}

	public int cacl(int firstNum, int secondNum) {
		return this.calculator.cacl(firstNum, secondNum);
	}
}
