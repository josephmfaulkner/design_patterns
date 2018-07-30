
public class Cinnamon extends Condiment {
	private Beverage beverage; 
	
	public Cinnamon(Beverage beverage)
	{
		this.beverage = beverage; 
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + ", Cinnamon";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + 19.95;
	}
	
	
	
}
