package ex03_decorationPattern.starBuzz.decorators;

import ex03_decorationPattern.starBuzz.abtractClasses.Beverage;
import ex03_decorationPattern.starBuzz.abtractClasses.CondimentDecorator;

public class SteamMilk extends CondimentDecorator{

	Beverage beverage;
	
	public SteamMilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " 스팀밀크";
	}
	
	@Override
	public double cost() {
		return .10 + beverage.cost();
	}
	
	
}
