package com.gui.practise.design_model.principles.lod.good;

import java.util.List;

public class GroupLeader {
	private List<Girl> girlList;
	
	public GroupLeader(List<Girl> girlList){
		this.girlList = girlList;
	}
	
	public void countGirls() {
		System.out.println(" girl's total count is : " + girlList.size());
	}
}
