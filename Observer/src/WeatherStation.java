import java.util.ArrayList;

public class WeatherStation implements Subject {

	private float temp, humidity, pressure; 
	private ArrayList<Observer> observers; 
	
	
	public WeatherStation() {
		this.observers = new ArrayList<Observer>(); 
	}
	
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.remove(observer);
		
	}
	
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer observer : observers) {
			observer.update(this.temp, this.humidity, this.pressure);
		}
	}
	
	public void updateWeatherData(float temp, float humidity, float pressure)
	{
		this.temp = temp; this.humidity = humidity; this.pressure = pressure;
		this.notifyObservers();
	}



}
