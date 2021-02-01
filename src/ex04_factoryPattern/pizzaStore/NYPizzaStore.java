package ex04_factoryPattern.pizzaStore;

import ex04_factoryPattern.pizza.NYStyleCheesePizza;
import ex04_factoryPattern.pizza.NYStyleClamPizza;
import ex04_factoryPattern.pizza.NYStylePepperoniPizza;
import ex04_factoryPattern.pizza.NYStyleVeggiePizza;
import ex04_factoryPattern.pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		
		if(type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if(type.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else if(type.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if(type.equals("clam")) {
			return new NYStyleClamPizza();
		} else return null;
	}
	
}
