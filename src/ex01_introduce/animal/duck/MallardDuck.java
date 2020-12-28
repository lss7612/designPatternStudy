package ex01_introduce.animal.duck;

import ex01_introduce.behavior.impl.FlyWithWings;
import ex01_introduce.behavior.impl.Quack;

public class MallardDuck extends Duck{

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("저는 물오리입니다.");
	}
	
}
