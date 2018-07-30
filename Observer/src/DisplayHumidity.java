
public class DisplayHumidity implements Observer, DisplayElement
{
	private float humidity ; 
	private Subject weatherData; 
	
	public DisplayHumidity(Subject subject) {
		this.weatherData = subject; 
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.humidity    = humidity; 
		display(); 
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("===  Humidity   ===");
		System.out.println("HUMIDITY : " + this.humidity);
		System.out.println("===================");
	}
}