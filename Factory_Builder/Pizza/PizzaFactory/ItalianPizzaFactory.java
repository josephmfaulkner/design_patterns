package PizzaFactory;

import Pizza.*;

public class ItalianPizzaFactory extends PizzaFactory {
	public Pizza makePizza(PizzaType.Style style) {
		Pizza thePizza = null; 
		if(style == PizzaType.Style.Pepperoni) {
			thePizza = new PepperoniPizza();
			thePizza.addTopping("Salami");
		}
		if(style == PizzaType.Style.Cheese) {
			thePizza = new CheesePizza();
			thePizza.addTopping("Cheddar");
			thePizza.addTopping("Stilton");
			thePizza.addTopping("Bree");
		}
		if(style == PizzaType.Style.Veggie) {
			thePizza = new VeggiePizza();
			thePizza.addTopping("Onions");
			thePizza.addTopping("Mushrooms");
			thePizza.addTopping("Tomatoes");
		}
		if(style == PizzaType.Style.DoubleMeat) {
			thePizza = new DoubleMeatPizza();
			thePizza.addTopping("Salami");
			thePizza.addTopping("Chicken");
			thePizza.addTopping("Sausage");
		}
		if(style == PizzaType.Style.Sausage) {
			thePizza = new SausagePizza();
			thePizza.addTopping("Sausage (duh)");
		}
		if(style == PizzaType.Style.Diet) {
			thePizza = new DietPizza();
			thePizza.addTopping("Kale");
			thePizza.addTopping("Lettuce");
			thePizza.addTopping("Vinegar");
		}
		
		
		return thePizza; 
	}
}
