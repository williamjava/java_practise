package com.gui.practise.design_model.principles.iSepP.good;

public class PrettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {
	private String name;

	public PrettyGirl(String name) {
		this.name = name;
	}

	public void goodLooking() {
		System.out.println(this.name + " has a good looking...");
	}

	public void niceFigure() {
		System.out.println(this.name + " has a nice figure...");
	}

	public void greatTemperament() {
		System.out.println(this.name + " has a great temperament...");
	}

}
