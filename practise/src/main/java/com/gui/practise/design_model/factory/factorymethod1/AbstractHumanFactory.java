package com.gui.practise.design_model.factory.factorymethod1;

import com.gui.practise.design_model.factory.factorymethod1.IHuman;

/**
 * 抽象工厂角色
 * 
 * @author wuhoujian
 *
 */
public abstract class AbstractHumanFactory {
	abstract <T extends IHuman> T createHuman(Class<T> c);
}
