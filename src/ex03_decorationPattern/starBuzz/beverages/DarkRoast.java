package ex03_decorationPattern.starBuzz.beverages;

import ex03_decorationPattern.starBuzz.abtractClasses.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "다크 로스트 커피";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}
	
}
