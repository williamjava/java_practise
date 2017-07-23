package com.gui.practise.design_model.principles.lod.bad;

public class Client {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		GroupLeader leader = new GroupLeader();
		teacher.command(leader);
	}

}
