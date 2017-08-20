package com.gui.practise.design_model.strategy;

/**
 * 策略枚举，减少策略类的数量，使用策略不常变化的场景
 * 
 * @author wuhoujian
 *
 */
public enum CalculatorEnum {
	ADD("+") {
		@Override
		public int calc(int firstNum, int secondNum) {
			return firstNum + secondNum;
		}
	},
	SUB("-") {
		@Override
		public int calc(int firstNum, int secondNum) {
			return firstNum - secondNum;
		}
	};

	String symbol;

	public String getSymbol() {
		return symbol;
	}

	private CalculatorEnum(String symbol) {
		this.symbol = symbol;
	}

	public abstract int calc(int firstNum, int secondNum);
}
