package com.gui.practise.design_model.principles.lsp;

public class Soldier {
	private AbstractGun gun;

	public void setGun(AbstractGun gun) {
		this.gun = gun;
	}

	public void killEnemy() {
		gun.shoot();
	}
}
