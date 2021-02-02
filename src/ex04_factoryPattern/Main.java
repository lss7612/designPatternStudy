package ex04_factoryPattern;

import ex04_factoryPattern.pizzaStore.face.PizzaStore;
import ex04_factoryPattern.pizzaStore.impl.ChicagoPizzaStore;
import ex04_factoryPattern.pizzaStore.impl.NYPizzaStore;

public class Main {
	public static void main(String[] args) {
	
		PizzaStore nyPizzaStore = new NYPizzaStore();
		nyPizzaStore.orderPizza("cheese");
		
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		chicagoPizzaStore.orderPizza("cheese");
		
	}
}
