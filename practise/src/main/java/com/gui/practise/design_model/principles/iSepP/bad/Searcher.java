package com.gui.practise.design_model.principles.iSepP.bad;

public class Searcher extends AbstractSearcher {

	public Searcher(IPrettyGirl prettyGirl) {
		super(prettyGirl);
	}

	@Override
	void show() {
		System.out.println("=====My pretty girl is here....=====");
		super.prettyGirl.goodLooking();
		super.prettyGirl.niceFigure();
		super.prettyGirl.greatTemperament();
	}

}
