
public class DisplayPressure implements Observer, DisplayElement
{
	private float pressure; 
	private Subject weatherData; 
	
	public DisplayPressure(Subject subject) {
		this.weatherData = subject; 
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.pressure    = pressure; 
		display(); 
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("===  Pressure   ===");
		System.out.println("PRESSURE : " + this.pressure);
		System.out.println("===================");
	}
}