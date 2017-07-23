package com.gui.practise.design_model.principles.iSepP.bad;

public abstract class AbstractSearcher {
	protected IPrettyGirl prettyGirl;

	public AbstractSearcher(IPrettyGirl prettyGirl) {
		this.prettyGirl = prettyGirl;
	}
	
	abstract void show();
}
