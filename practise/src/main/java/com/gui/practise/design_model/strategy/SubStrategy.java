package com.gui.practise.design_model.strategy;

/**
 * 具体策略 - 执行减法运算
 * 
 * @author wuhoujian
 *
 */
public class SubStrategy implements ICalculator {

	public int cacl(int firstNum, int secondNum) {
		return firstNum - secondNum;
	}

}
