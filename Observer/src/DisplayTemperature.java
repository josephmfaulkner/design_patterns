
public class DisplayTemperature implements Observer, DisplayElement
{
	private float temp; 
	private Subject weatherData; 
	
	public DisplayTemperature(Subject subject) {
		this.weatherData = subject; 
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp     = temp; 
		display(); 
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("=== Temperature ===");
		System.out.println("TEMP    : " + this.temp);
		System.out.println("===================");
	}
}
