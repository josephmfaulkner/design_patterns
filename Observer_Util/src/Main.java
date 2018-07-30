
public class Main {
	public static void main(String args[])
	{
		
		System.out.println("Start: ");
		
		WeatherStation weatherStation = new WeatherStation(); 
		
		CurrentConditionsDisplay displayConditions = new CurrentConditionsDisplay(weatherStation);
		
		
		weatherStation.updateWeatherData(0.0f,0.0f,0.0f);
		weatherStation.updateWeatherData(1.0f,10.0f,100.0f);
		weatherStation.updateWeatherData(2.0f,20.0f,200.0f);
		weatherStation.updateWeatherData(3.0f,0.0f,1.0f);
		
		

		
		System.out.println("Stop: ");
	}
}
