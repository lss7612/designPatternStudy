package ex02_observerPattern;

import ex02_observerPattern.face.DisplayElement;
import ex02_observerPattern.face.Observer;
import ex02_observerPattern.face.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.resisterObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current Condition : "+temperature+"F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
