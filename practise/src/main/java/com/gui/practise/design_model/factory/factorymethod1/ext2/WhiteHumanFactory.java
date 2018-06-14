package com.gui.practise.design_model.factory.factorymethod1.ext2;

import com.gui.practise.design_model.factory.factorymethod1.IHuman;
import com.gui.practise.design_model.factory.factorymethod1.WhiteHuman;

/**
 * 具体工厂角色 - 该工厂负责产生白种人
 * 
 * @author wuhoujian
 *
 */
public class WhiteHumanFactory extends AbstractHumanFactory {

	public IHuman createHuman() {
		return new WhiteHuman();
	}
}
