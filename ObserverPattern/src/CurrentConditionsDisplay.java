import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	

	
	public void update(Observable obs,Object data){
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			display();
		}
	}
	
	public void display(){
		System.out.println(temperature);
	}
}
