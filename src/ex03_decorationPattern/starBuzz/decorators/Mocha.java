package ex03_decorationPattern.starBuzz.decorators;

import ex03_decorationPattern.starBuzz.abtractClasses.Beverage;
import ex03_decorationPattern.starBuzz.abtractClasses.CondimentDecorator;

public class Mocha extends CondimentDecorator{
	
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+" 모카 추가";
	}
	
	@Override
	public double cost() {
		return .20 + beverage.cost();
	}
	
}
