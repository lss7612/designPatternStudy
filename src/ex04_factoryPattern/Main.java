package ex04_factoryPattern;

import ex04_factoryPattern.pizzaStore.ChicagoPizzaStore;
import ex04_factoryPattern.pizzaStore.NYPizzaStore;
import ex04_factoryPattern.pizzaStore.PizzaStore;

public class Main {
	public static void main(String[] args) {
	
		PizzaStore nyPizzaStore = new NYPizzaStore();
		nyPizzaStore.orderPizza("cheese");
		
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		chicagoPizzaStore.orderPizza("cheese");
		
	}
}
