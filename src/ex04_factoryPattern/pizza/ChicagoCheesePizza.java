package ex04_factoryPattern.pizza;

public class ChicagoCheesePizza extends Pizza {
	public ChicagoCheesePizza() {
		name = "Chicago Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	@Override
	public void cut() {
		System.out.println("Cuttong pizza into square slices");
	}
}
