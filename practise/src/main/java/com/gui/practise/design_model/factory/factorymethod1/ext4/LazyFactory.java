package com.gui.practise.design_model.factory.factorymethod1.ext4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.gui.practise.design_model.factory.factorymethod1.BlackHuman;
import com.gui.practise.design_model.factory.factorymethod1.IHuman;
import com.gui.practise.design_model.factory.factorymethod1.WhiteHuman;
import com.gui.practise.design_model.factory.factorymethod1.YellowHuman;

/**
 * 延迟加载的工具类
 * 
 * @author wuhoujian
 *
 */
public class LazyFactory {
	private static final Map<String, IHuman> prMap = new HashMap<String, IHuman>();

	public static synchronized IHuman createHuman(String type) {
		IHuman human = null;
		if (prMap.containsKey(type)) {
			human = prMap.get(type);
		} else {
			if (Objects.equals(type, "yellow")) {
				human = new YellowHuman();
			}

			if (Objects.equals(type, "white")) {
				human = new WhiteHuman();
			}

			if (Objects.equals(type, "black")) {
				human = new BlackHuman();
			}

			prMap.put(type, human);
		}

		return human;
	}
}
