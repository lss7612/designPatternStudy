package ex01_stretagyPattern.test;

import ex01_stretagyPattern.behavior.impl.AxeBehavior;
import ex01_stretagyPattern.character.Charactor;
import ex01_stretagyPattern.character.ext.King;

public class CharactorSimul {

	public static void main(String[] args) {
		
		Charactor james = new King();
		
		james.setWeapon(new AxeBehavior());
		james.fight();
		
	}
	
}
