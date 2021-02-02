package ex04_factoryPattern.pizzaStore.impl;

import ex04_factoryPattern.pizza.face.Pizza;
import ex04_factoryPattern.pizza.nyMenu.NYStyleCheesePizza;
import ex04_factoryPattern.pizza.nyMenu.NYStyleClamPizza;
import ex04_factoryPattern.pizza.nyMenu.NYStylePepperoniPizza;
import ex04_factoryPattern.pizza.nyMenu.NYStyleVeggiePizza;
import ex04_factoryPattern.pizzaStore.face.PizzaStore;

public class NYPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		
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
