package ex01_introduce.behavior.impl;

import ex01_introduce.behavior.face.QuackBehavior;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		//아무것도 하지 않음 소리를 낼 수 없ㅂ는 경우
		System.out.println("조용..");
	}

}
