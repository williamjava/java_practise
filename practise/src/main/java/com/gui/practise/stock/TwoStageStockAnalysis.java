package com.gui.practise.stock;

/**
 * 下一个十年增长10%，然后5%，现在的股东盈余是8.28，贴现率是9%（长期国债的利率）
 * 
 * 根据以上数据，判断某个公司的内在价值
 * 
 * 参考链接：http://blog.sina.com.cn/s/blog_74291e1c0102wiy1.html
 * 
 * @author sunjian 2017/04/26
 *
 */
public class TwoStageStockAnalysis {
	public static void main(String[] args) {
		// 计算美的的内在价值和每股真实股价
		System.out.println("美的集团");
		double meiDiCompanyValue = calculateCompanyTrueValue(146.84, 0.1, 0.05, 0.1, 3);
		double meiDiPerStockValue = calculatePerStockValue(146.84, 0.1, 0.05, 0.1, 1, 64.66);

		System.out.println(meiDiCompanyValue);
		System.out.println(meiDiPerStockValue);

		System.out.println("格力电器：");
		double geLiPerStockValue = calculatePerStockValue(154.20, 0.1, 0.05, 0.1, 1, 60.15);
		System.out.println(geLiPerStockValue);
		
		System.out.println("永辉超市：");
		double yongHuiPerStockValue = calculatePerStockValue(12.42, 0.1, 0.05, 0.1, 1, 95.7);
		System.out.println(yongHuiPerStockValue);
		
		System.out.println("海康威视：");
		double haiKangPerStockValue = calculatePerStockValue(74.22, 0.1, 0.05, 0.1, 1, 61.55);
		System.out.println(haiKangPerStockValue);

		// 测试
		System.out.println("测试：");
		double meiDiCompanyValue1 = calculateCompanyTrueValue(8.28, 0.05, 0.05, 0.09, 10);
		System.out.println(meiDiCompanyValue1);

		// 计算涪陵榨菜的内在价值和每股真实股价
		// double companyValue = calculateCompanyTrueValue(11.6, 0.2, 0.05, 0.1,
		// 5);
		// double perStockValue = calculatePerStockValue(11.6, 0.2, 0.05, 0.1,
		// 5, 28.19);
		//
		// System.out.println(companyValue);
		// System.out.println(perStockValue);
	}

	/**
	 * 两段法估值 计算某个公司的自由现金流
	 * 
	 * @param nowProfit
	 *            公司当前年度的股东盈余 股东盈余=税后利润+折旧+摊销（无形摊销+长期摊销）-资本开支 如果粗略计算，可以认为
	 *            股东盈余=净利润
	 * 
	 * @param firstStageGrowthRate
	 *            第一个发展阶段（高速阶段）的增长率
	 * 
	 * @param secondStageGrowthRate
	 *            第二个发展阶段(永续阶段，长期阶段)的增长率
	 * 
	 *            注意：对于成长型股票来说，通常第一阶段的增长率较大，既认为公司不会一直高速发展，这样较为保守。
	 *            很明显，第一第二阶段的增长率越高，市值越大
	 * 
	 * @param discountRate
	 *            贴现率 贴现率越大，最终计算的市值相对较小。一般认为贴现率 = 30年长期债券的利率。如果要保守计算，可以把贴现率调大一点
	 * 
	 * @param nYears
	 *            公司的第一个发展阶段的高速增长率可能保持的时间
	 * @return
	 */

	public static double calculateCompanyTrueValue(double nowProfit, double firstStageGrowthRate,
			double secondStageGrowthRate, double discountRate, int nYears) {
		final double nYearsLaterProfit = nowProfit * Math.pow((1 + firstStageGrowthRate), nYears); //  N年后的值，指数计算

		// firstStageCashValue 第一阶段的自由现金流折现后的值
		double firstStageCashValue = 0;
		for (int i = 1; i <= nYears; i++) {
			firstStageCashValue += nowProfit * Math.pow((1 + firstStageGrowthRate), i)
					/ Math.pow((1 + discountRate), i);
		}

		// secondStageCashValue 第二阶段的自由现金流折现后的值
		final double secondStageCashValue = (nYearsLaterProfit * (1 + secondStageGrowthRate)
				/ (discountRate - secondStageGrowthRate)) / Math.pow((1 + discountRate), nYears);

		return firstStageCashValue + secondStageCashValue;
	}

	/**
	 * 计算某公司每一股的价值
	 * 
	 * @param nowProfit
	 *            股东盈余
	 * @param firstStageGrowthRate
	 *            第一个发展阶段（高速阶段）的增长率
	 * @param secondStageGrowthRate
	 *            第二个发展阶段(永续阶段，长期阶段)的增长率
	 * @param discountRate
	 *            贴现率
	 * @param nYears
	 *            公司的第一个发展阶段的高速增长率可能保持的时间
	 * 
	 * @param totalStockNums
	 *            公司发行的总股数
	 * @return
	 */

	public static double calculatePerStockValue(double nowProfit, double firstStageGrowthRate,
			double secondStageGrowthRate, double discountRate, int nYears, double totalStockNums) {
		double companyValue = calculateCompanyTrueValue(nowProfit, firstStageGrowthRate, secondStageGrowthRate,
				discountRate, nYears);

		return companyValue / totalStockNums;
	}

}