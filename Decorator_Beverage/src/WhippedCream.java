
public class WhippedCream extends Condiment {
	private Beverage beverage; 
	
	public WhippedCream(Beverage beverage)
	{
		this.beverage = beverage; 
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + ", WhippedCream";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + 50;
	}
	
}
