import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer
{
	private float temp, humidity, pressure; 
	private Observable weatherData; 
	
	public CurrentConditionsDisplay(Observable subject) {
		this.weatherData = subject; 
		this.weatherData.addObserver(this);
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("=== CURRENT CONDITIONS ===");
		System.out.println("TEMP    : " + this.temp);
		System.out.println("HUMIDITY: " + this.humidity);
		System.out.println("PRESSURE: " + this.pressure);
	}

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		WeatherStation weatherData = (WeatherStation) o; 
		this.temp     = weatherData.Temp(); 
		this.humidity = weatherData.Humidity(); 
		this.pressure = weatherData.Pressure(); 
		display(); 
	}
}
