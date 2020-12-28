package ex01_introduce.behavior.impl;

import ex01_introduce.behavior.face.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		//날아다니는 것을 구현
		System.out.println("날고있어요!");
	}
	
}
