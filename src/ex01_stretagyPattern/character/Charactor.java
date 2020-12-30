package ex01_stretagyPattern.character;

import ex01_stretagyPattern.behavior.face.WeaponBehavior;

public abstract class Charactor {

	protected WeaponBehavior weapon;
	
	public abstract void fight();
	
	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}
	
}
