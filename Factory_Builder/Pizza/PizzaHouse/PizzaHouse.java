package PizzaHouse;
import PizzaFactory.*; 
import Pizza.*; 

public abstract class PizzaHouse {
	protected PizzaFactory pizzaFactory; 
	
	public Pizza orderPizza(PizzaType.Style style)
	{
		Pizza thePizza = pizzaFactory.makePizza(style);
		
		thePizza.prepare();
		thePizza.bake();
		thePizza.slice();
		thePizza.box();
		
		return thePizza; 
	}
}
