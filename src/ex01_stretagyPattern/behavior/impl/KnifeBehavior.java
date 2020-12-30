package ex01_stretagyPattern.behavior.impl;

import ex01_stretagyPattern.behavior.face.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior{

	@Override
	public void useWeapon() {
		System.out.println("휘익 ~ (나이프 휘두른다.)");
	}
	
}
