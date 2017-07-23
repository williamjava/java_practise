package com.gui.practise.design_model.principles.dip.bad;

public class WilliamDriver {
	public static void main(String[] args) {
		Driver williamDriver = new Driver();
		williamDriver.drive(new Benz());
	}
}
