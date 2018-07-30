package Pizza;

import java.util.List;
import java.util.LinkedList;

public abstract class Pizza {
	protected String pizzaName = "";
	protected List<String> toppings = new LinkedList<String>(); 
	
	public String getPizzaName()
	{
		return this.pizzaName; 
	}
	
	public void addTopping(String topping)
	{
		this.toppings.add(topping);
	}
	
	public abstract void prepare();
	public abstract void bake();
	public abstract void slice();
	public abstract void box();
	
}
