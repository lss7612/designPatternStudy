package ex02_observerPattern.face;

public interface Subject {

	public void resisterObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
	
}
