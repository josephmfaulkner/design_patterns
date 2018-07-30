
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage drink = new Cinnamon(new WhippedCream((new Mocha(new Frapp())))); 
		System.out.println(drink.getDescription());
		System.out.println(drink.cost());
		System.out.println(drink.getClass().getName());
	}

}
