package ex03_decorationPattern.starBuzz.beverages;

import ex03_decorationPattern.starBuzz.abtractClasses.Beverage;

public class Espresso extends Beverage {

	public Espresso() {
		description = "에스프레소";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
