package com.gui.practise.design_model.factory.factorymethod1.ext2;

import com.gui.practise.design_model.factory.factorymethod1.IHuman;
import com.gui.practise.design_model.factory.factorymethod1.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory {

	public IHuman createHuman() {
		return new YellowHuman();
	}
}
