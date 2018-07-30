package PizzaFactory;

import Pizza.Pizza;
import Pizza.PizzaType;

public abstract class PizzaFactory {
	public abstract Pizza makePizza(PizzaType.Style style);
}
