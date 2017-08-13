package com.gui.practise.design_model.factory.factorymethod1.ext2;

import com.gui.practise.design_model.factory.factorymethod1.IHuman;
import com.gui.practise.design_model.factory.factorymethod1.WhiteHuman;

public class WhiteHumanFactory extends AbstractHumanFactory {

	public IHuman createHuman() {
		return new WhiteHuman();
	}
}
