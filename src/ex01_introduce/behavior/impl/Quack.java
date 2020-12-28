package ex01_introduce.behavior.impl;

import ex01_introduce.behavior.face.QuackBehavior;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		//꽥꽥 소리를 낸다.
		System.out.println("꽥꽥");
	}

	
}
