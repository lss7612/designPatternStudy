package ex03_decorationPattern.starBuzz.main;

import ex03_decorationPattern.starBuzz.abtractClasses.Beverage;
import ex03_decorationPattern.starBuzz.beverages.DarkRoast;
import ex03_decorationPattern.starBuzz.beverages.Espresso;
import ex03_decorationPattern.starBuzz.beverages.HouseBlend;
import ex03_decorationPattern.starBuzz.decorators.Mocha;
import ex03_decorationPattern.starBuzz.decorators.Soy;
import ex03_decorationPattern.starBuzz.decorators.Whip;

public class StarBuzzCoffee {
	public static void main(String[] args) {
		Beverage beverage01 = new Espresso();
		System.out.println(beverage01.getDescription()+" $"+beverage01.cost());
		
		Beverage beverage02 = new DarkRoast();
		beverage02 = new Mocha(beverage02);
		beverage02 = new Mocha(beverage02);
		beverage02 = new Whip(beverage02);
		System.out.println(beverage02.getDescription()+" $"+beverage02.cost());
		
		Beverage beverage03 = new HouseBlend();
		beverage03 = new Soy(beverage03);
		beverage03 = new Mocha(beverage03);
		beverage03 = new Whip(beverage03);
		System.out.println(beverage03.getDescription()+" $"+beverage03.cost());		
		
	}
}
