
public class Mocha extends Condiment {

	private Beverage beverage; 
	
	public Mocha(Beverage beverage)
	{
		this.beverage = beverage; 
	}
	
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + ", Mocha";
	}

	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + .50;
	}

}
