package com.gui.practise.design_model.principles.lod.bad;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
	public void command(GroupLeader leader) {
		List<Girl> girlList = new ArrayList<Girl>();

		for (int i = 0; i < 20; i++) {
			girlList.add(new Girl());
		}

		leader.countGirls(girlList);
	}
}
