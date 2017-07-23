package com.gui.practise.design_model.principles.dip.good;

public class Driver implements IDriver {

	public void drive(ICar car) {
		car.run();
	}

}
