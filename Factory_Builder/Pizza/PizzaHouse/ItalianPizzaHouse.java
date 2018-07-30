package PizzaHouse;

import PizzaFactory.ItalianPizzaFactory;

public class ItalianPizzaHouse extends PizzaHouse {
	public ItalianPizzaHouse() {
		this.pizzaFactory = new ItalianPizzaFactory(); 
	}
}