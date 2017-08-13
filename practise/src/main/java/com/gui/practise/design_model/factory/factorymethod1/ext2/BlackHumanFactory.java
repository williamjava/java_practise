package com.gui.practise.design_model.factory.factorymethod1.ext2;

import com.gui.practise.design_model.factory.factorymethod1.BlackHuman;
import com.gui.practise.design_model.factory.factorymethod1.IHuman;

public class BlackHumanFactory extends AbstractHumanFactory {

	public IHuman createHuman() {
		return new BlackHuman();
	}
}
