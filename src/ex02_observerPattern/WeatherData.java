package ex02_observerPattern;

import java.util.ArrayList;

import ex02_observerPattern.face.Observer;
import ex02_observerPattern.face.Subject;

public class WeatherData implements Subject{

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList();
	}
	
	@Override
	public void resisterObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	
	
}
