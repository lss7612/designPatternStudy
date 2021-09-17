package ex01_stretagyPattern.character.ext;

import ex01_stretagyPattern.character.Charactor;

public class King extends Charactor {

	public King() {
	}
	
	@Override
	public void fight() {	
		weapon.useWeapon();
	}

}
