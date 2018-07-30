package PizzaHouse;
import Pizza.PizzaType;

public class BuildPizzaHouse {
	public static PizzaHouse buildHouse(PizzaType.Shop shop)
	{
		PizzaHouse thePizzaHouse = null; 
		
		if(shop == PizzaType.Shop.Italy) {
			thePizzaHouse = new ItalianPizzaHouse(); 
		}
		if(shop == PizzaType.Shop.California) {
			thePizzaHouse = new CaliforniaPizzaHouse();
		} 
		if(shop == PizzaType.Shop.NewYork) {
			thePizzaHouse = new NewYorkPizzaHouse();
		} 
		if(shop == PizzaType.Shop.Oregon) {
			thePizzaHouse = new OregonPizzaHouse();
		} 
						
		return thePizzaHouse; 
	}
}
