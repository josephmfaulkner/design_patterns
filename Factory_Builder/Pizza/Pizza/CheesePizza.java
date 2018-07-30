package Pizza;

public class CheesePizza extends Pizza {

	public CheesePizza() {this.pizzaName = "CheesePizza"; }
	
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.print("Adding Toppings: ");
		for(String topping: this.toppings)
		{
			System.out.print(topping + " ");
		}
		System.out.println("");
		System.out.println("Kids and fat people like a lotta cheese");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("You can just smell the cheese melting like crazy.");
	}

	@Override
	public void slice() {
		// TODO Auto-generated method stub
		System.out.println("Slice pizza into three pieces");
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("The greese is dripping right through the box...");
	}

}