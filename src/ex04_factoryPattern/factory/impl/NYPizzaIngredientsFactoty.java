package ex04_factoryPattern.factory.impl;

import ex04_factoryPattern.factory.face.PizzaIngredientFactory;
import ex04_factoryPattern.pizzaIngredients.face.Cheese;
import ex04_factoryPattern.pizzaIngredients.face.Clams;
import ex04_factoryPattern.pizzaIngredients.face.Dough;
import ex04_factoryPattern.pizzaIngredients.face.Pepperoni;
import ex04_factoryPattern.pizzaIngredients.face.Sauce;
import ex04_factoryPattern.pizzaIngredients.face.Veggie;

public class NYPizzaIngredientsFactoty implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sauce createSouce() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Veggie[] createVeggies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clams createClams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return null;
	}

}
