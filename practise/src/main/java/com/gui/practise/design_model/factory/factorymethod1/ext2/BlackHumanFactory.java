package com.gui.practise.design_model.factory.factorymethod1.ext2;

import com.gui.practise.design_model.factory.factorymethod1.BlackHuman;
import com.gui.practise.design_model.factory.factorymethod1.IHuman;

/**
 * 具体工厂角色 - 该工厂负责产生黑种人
 * 
 * @author wuhoujian
 *
 */
public class BlackHumanFactory extends AbstractHumanFactory {

	public IHuman createHuman() {
		return new BlackHuman();
	}
}
