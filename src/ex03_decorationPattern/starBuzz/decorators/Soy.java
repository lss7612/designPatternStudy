package ex03_decorationPattern.starBuzz.decorators;

import ex03_decorationPattern.starBuzz.abtractClasses.Beverage;
import ex03_decorationPattern.starBuzz.abtractClasses.CondimentDecorator;

public class Soy extends CondimentDecorator{

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " 두유로 변경";
	}
	
	@Override
	public double cost() {
		return .15 + beverage.cost();
	}
	
}
