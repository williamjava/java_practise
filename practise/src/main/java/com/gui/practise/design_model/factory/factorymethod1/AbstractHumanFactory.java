package com.gui.practise.design_model.factory.factorymethod1;

public abstract class AbstractHumanFactory {
	abstract <T extends IHuman> T createHuman(Class<T> c);
}
