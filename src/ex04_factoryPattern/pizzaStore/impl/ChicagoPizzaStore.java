package ex04_factoryPattern.pizzaStore.impl;

import ex04_factoryPattern.pizza.chicagoMenu.ChicagoCheesePizza;
import ex04_factoryPattern.pizza.chicagoMenu.ChicagoClamPizza;
import ex04_factoryPattern.pizza.chicagoMenu.ChicagoPepperoniPizza;
import ex04_factoryPattern.pizza.chicagoMenu.ChicagoVeggiePizza;
import ex04_factoryPattern.pizza.face.Pizza;
import ex04_factoryPattern.pizzaStore.face.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		
		if(type.equals("cheese")) {
			return new ChicagoCheesePizza();
		} else if(type.equals("pepperoni")) {
			return new ChicagoPepperoniPizza();
		} else if(type.equals("veggie")) {
			return new ChicagoVeggiePizza();
		} else if(type.equals("clam")) {
			return new ChicagoClamPizza();
		} else return null;
	}

}
 