package ex01_introduce.behavior.impl;

import ex01_introduce.behavior.face.QuackBehavior;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		//고무오리의 삑삑소리를 낸다.
		System.out.println("삑삑");
	}
	
}
