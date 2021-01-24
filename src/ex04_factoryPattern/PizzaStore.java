package ex04_factoryPattern;

public class PizzaStore {
	
	public PizzaStore() {
		// TODO Auto-generated constructor stub
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = factory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
}
