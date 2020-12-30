package ex01_stretagyPattern.behavior.impl;

import ex01_stretagyPattern.behavior.face.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("휘익 ~ (검을 휘두른다.)");
	}
	
}
