package ex03_decorationPattern.starBuzz.decorators;

import ex03_decorationPattern.starBuzz.abtractClasses.Beverage;
import ex03_decorationPattern.starBuzz.abtractClasses.CondimentDecorator;

public class Whip extends CondimentDecorator{

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " 휘핑 추가";
	}
	
	@Override
	public double cost() {
		return .10+beverage.cost();
	}
	
}
