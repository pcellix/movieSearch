
public class WeatherStation {
	public static void main(String[] args){
		WeatherData weatherData = new WeatherData();
		WeatherShit weathershit = new WeatherShit();
		CurrentConditionsDisplay c1 = new CurrentConditionsDisplay();
		ForecastDisplay f1 = new ForecastDisplay(weatherData);
		weatherData.addObserver(c1);

		
		weatherData.setMeasurements(21, 32, 99);
		weatherData.setMeasurements(21, 32, 58);
		weathershit.setMeasurements(21, 23, 33);
	
		
	}
}
