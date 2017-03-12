package com.gui.practise.design_model.factory.factorymethod;

import com.gui.practise.design_model.factory.model.Sample;
import com.gui.practise.design_model.factory.model.SampleA;
import com.gui.practise.design_model.factory.model.SampleB;

/**
 * 工厂方法
 * 
 * @author wuhoujian
 *
 */
public class Factory {
	public static Sample creator(int which) {
		switch (which) {
		case 1:
			return new SampleA();
		case 2:
			return new SampleB();
		default:
			return null;
		}
	}
}
