package com.gui.practise.design_model.factory.factorymethod1.ext2;

import com.gui.practise.design_model.factory.factorymethod1.IHuman;

/**
 * 抽象工厂角色，对应的具体工厂角色升级为多个工厂类
 * 
 * @author wuhoujian
 *
 */
public abstract class AbstractHumanFactory {
	abstract IHuman createHuman();
}
