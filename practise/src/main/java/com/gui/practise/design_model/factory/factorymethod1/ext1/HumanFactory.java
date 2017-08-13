package com.gui.practise.design_model.factory.factorymethod1.ext1;

import com.gui.practise.design_model.factory.factorymethod1.IHuman;

public class HumanFactory {

	@SuppressWarnings("unchecked")
	public static <T extends IHuman> T createHuman(Class<T> c) {
		IHuman human = null;

		try {
			human = (IHuman) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return (T) human;
	}
}
