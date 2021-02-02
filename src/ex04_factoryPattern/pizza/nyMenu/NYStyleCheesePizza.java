package ex04_factoryPattern.pizza.nyMenu;

import ex04_factoryPattern.pizza.face.Pizza;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		name = "NyStyle Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
	
}
