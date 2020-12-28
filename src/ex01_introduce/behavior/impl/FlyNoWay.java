package ex01_introduce.behavior.impl;

import ex01_introduce.behavior.face.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		//날 수 없는 경우
		System.out.println("저는 못날아요");
	}

	
	
}
