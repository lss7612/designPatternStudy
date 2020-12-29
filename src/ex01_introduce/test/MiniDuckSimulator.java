package ex01_introduce.test;

import ex01_introduce.animal.duck.Duck;
import ex01_introduce.animal.duck.MallardDuck;
import ex01_introduce.animal.duck.ModelDuck;
import ex01_introduce.behavior.impl.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.performQuack();
	}
	
}
