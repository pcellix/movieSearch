import java.util.Observable;
import java.util.Observer;


public class ForecastDisplay implements Observer, DisplayElement {
	Observable observable;
	private float pressure;
	
	ForecastDisplay(Observable o1){
		o1.addObserver(this);
	}
	
	public void update(Observable observable, Object object){
		if(observable instanceof WeatherData){
			WeatherData weatherData = (WeatherData)observable;
			this.pressure = weatherData.getPressure();
			display();
		}
	}
	public void display(){
		System.out.println(pressure);
		
	}	
}
	

