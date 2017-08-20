package com.gui.practise.design_model.strategy;

/**
 * 具体策略 - 执行加法运算
 * 
 * @author wuhoujian
 *
 */
public class AddStrategy implements ICalculator {

	public int cacl(int firstNum, int secondNum) {
		return firstNum + secondNum;
	}

}
