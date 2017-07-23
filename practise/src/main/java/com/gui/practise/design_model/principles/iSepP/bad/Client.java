package com.gui.practise.design_model.principles.iSepP.bad;

/**
 * 接口隔离原则
 * 
 * 高内聚
 * 
 * 接口粒度要小，但是需要把握一个度
 * 
 * @author wuhoujian
 *
 */
public class Client {

	public static void main(String[] args) {
		IPrettyGirl prettyGirl = new PrettyGirl("小美");
		AbstractSearcher searcher = new Searcher(prettyGirl);
		searcher.show();
	}

}
