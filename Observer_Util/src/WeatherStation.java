import java.util.Observable;
import java.util.ArrayList;

public class WeatherStation extends Observable {

	private float temp, humidity, pressure; 
	
	public float Temp()     { return this.temp;     }
	public float Humidity() { return this.humidity; }
	public float Pressure() { return this.pressure; }
	
	public WeatherStation() {
		
	}

	public void updateWeatherData(float temp, float humidity, float pressure)
	{
		this.temp = temp; this.humidity = humidity; this.pressure = pressure;
		setChanged(); 
		notifyObservers();
	}
	




}
