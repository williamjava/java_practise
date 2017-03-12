package com.gui.practise.design_model.factory;

import com.gui.practise.design_model.factory.factorymethod.Factory;

import junit.framework.TestCase;

public class FactoryTest extends TestCase {
	public void testFactoryCreator() {
		Factory.creator(1);

		Factory.creator(2);
	}
}
