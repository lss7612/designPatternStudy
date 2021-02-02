package ex04_factoryPattern.factory.face;

import ex04_factoryPattern.pizzaIngredients.face.Cheese;
import ex04_factoryPattern.pizzaIngredients.face.Clams;
import ex04_factoryPattern.pizzaIngredients.face.Dough;
import ex04_factoryPattern.pizzaIngredients.face.Pepperoni;
import ex04_factoryPattern.pizzaIngredients.face.Sauce;
import ex04_factoryPattern.pizzaIngredients.face.Veggie;

public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSouce();
	public Cheese createCheese();
	public Veggie[] createVeggies();
	public Clams createClams();
	public Pepperoni createPepperoni();
	
}
