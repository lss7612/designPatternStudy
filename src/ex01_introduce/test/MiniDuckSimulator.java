package ex01_introduce.test;

import ex01_introduce.animal.duck.Duck;
import ex01_introduce.animal.duck.MallardDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
	}
	
}
