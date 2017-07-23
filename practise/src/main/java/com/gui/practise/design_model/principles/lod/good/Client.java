package com.gui.practise.design_model.principles.lod.good;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特原则
 * 
 * 一个对象应该对其他对象有最少的了解
 * 
 * @author wuhoujian
 *
 */
public class Client {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();

		List<Girl> girlList = new ArrayList<Girl>();

		for (int i = 0; i < 20; i++) {
			girlList.add(new Girl());
		}
		GroupLeader leader = new GroupLeader(girlList);
		teacher.command(leader);
	}

}
