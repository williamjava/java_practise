package com.gui.practise.design_model.strategy;

/**
 * 具体策略执行
 * 
 * @author wuhoujian
 *
 */
public class CalcPerformer1 {

	public static void main(String[] args) {
		int firstNum = 100;
		int secondNum = 200;

		// 执行加法
		int addResult = CalculatorEnum.ADD.calc(firstNum, secondNum);
		System.out.println("加法运算结果：" + addResult);

		// 执行减法
		int subResult = CalculatorEnum.SUB.calc(firstNum, secondNum);
		System.out.println("减法运算结果：" + subResult);
	}
}
