package com.gui.practise.design_model.principles.lsp;

/**
 * 里式替换原则
 * 
 * 子类可以代替父类，但反过来父类不可以代替子类。
 * 
 * @author wuhoujian
 *
 */
public class SoldierAction {

	public static void main(String[] args) {
		Soldier williamSolider = new Soldier();
		williamSolider.setGun(new HandGun());
		williamSolider.killEnemy();

		williamSolider.setGun(new MachineGun());
		williamSolider.killEnemy();
	}

}
