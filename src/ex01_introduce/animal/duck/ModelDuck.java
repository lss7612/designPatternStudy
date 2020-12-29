package ex01_introduce.animal.duck;

import ex01_introduce.behavior.impl.FlyNoWay;
import ex01_introduce.behavior.impl.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("저는 모형오리입니다.");
	}
	
}
