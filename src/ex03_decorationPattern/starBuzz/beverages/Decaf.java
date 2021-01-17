package ex03_decorationPattern.starBuzz.beverages;

import ex03_decorationPattern.starBuzz.abtractClasses.Beverage;

public class Decaf extends Beverage{
	
	public Decaf() {
		description = "디카페인 커피";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}
}
