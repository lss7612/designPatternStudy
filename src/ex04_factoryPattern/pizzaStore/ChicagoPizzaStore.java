package ex04_factoryPattern.pizzaStore;

import ex04_factoryPattern.pizza.ChicagoCheesePizza;
import ex04_factoryPattern.pizza.ChicagoClamPizza;
import ex04_factoryPattern.pizza.ChicagoPepperoniPizza;
import ex04_factoryPattern.pizza.ChicagoVeggiePizza;
import ex04_factoryPattern.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		
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
 