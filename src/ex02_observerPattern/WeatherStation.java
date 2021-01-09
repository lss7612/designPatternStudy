package ex02_observerPattern;

public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(74, 90, 29.2f);
		
	}
	
}
