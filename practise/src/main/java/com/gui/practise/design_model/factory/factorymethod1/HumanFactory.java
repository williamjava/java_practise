package com.gui.practise.design_model.factory.factorymethod1;

import com.gui.practise.design_model.factory.factorymethod1.IHuman;

/**
 * 具体工厂角色
 * 
 * @author wuhoujian
 *
 */
public class HumanFactory extends AbstractHumanFactory {

	@SuppressWarnings("unchecked")
	@Override
	<T extends IHuman> T createHuman(Class<T> c) {
		IHuman human = null;

		try {
			human = (IHuman) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return (T) human;
	}

}
