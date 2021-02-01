package ex04_factoryPattern;

import ex04_factoryPattern.pizza.ChicagoCheesePizza;
import ex04_factoryPattern.pizza.ChicagoClamPizza;
import ex04_factoryPattern.pizza.ChicagoPepperoniPizza;
import ex04_factoryPattern.pizza.Pizza;
import ex04_factoryPattern.pizza.ChicagoVeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new ChicagoCheesePizza();
		} else if(type.equals("pepperoni")) {
			pizza = new ChicagoPepperoniPizza();
		} else if(type.equals("veggie")) {
			pizza = new ChicagoVeggiePizza();
		} else if(type.equals("clam")) {
			pizza = new ChicagoClamPizza();
		}
		
		
		return pizza;
	}
	
}
