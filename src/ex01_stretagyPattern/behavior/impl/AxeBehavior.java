package ex01_stretagyPattern.behavior.impl;

import ex01_stretagyPattern.behavior.face.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("휘익 ~ (도끼를 휘두른다.)");
	}

}
