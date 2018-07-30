import Pizza.*; 
import PizzaHouse.*; 


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaHouse pizzaHouse = BuildPizzaHouse.buildHouse(PizzaType.Shop.Italy);
		Pizza myPizza = pizzaHouse.orderPizza(PizzaType.Style.Cheese);
		
		System.out.println("Ordered " + myPizza.getPizzaName());
	}

}
