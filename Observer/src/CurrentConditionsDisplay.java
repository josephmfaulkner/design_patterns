import 

public class CurrentConditionsDisplay implements Observer, DisplayElement
{
	private float temp, humidity, pressure; 
	private Subject weatherData; 
	
	public CurrentConditionsDisplay(Subject subject) {
		this.weatherData = subject; 
		//this.weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp     = temp; 
		this.humidity = humidity; 
		this.pressure = pressure; 
		display(); 
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("=== CURRENT CONDITIONS ===");
		System.out.println("TEMP    : " + this.temp);
		System.out.println("HUMIDITY: " + this.humidity);
		System.out.println("PRESSURE: " + this.pressure);
	}
}
