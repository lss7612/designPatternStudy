package ex03_decorationPattern.starBuzz.beverages;

import ex03_decorationPattern.starBuzz.abtractClasses.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "하우스 블렌드 커피";
	}
	
	@Override
	public double cost() {
		return 0.89;
	}

}
