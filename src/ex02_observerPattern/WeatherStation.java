package ex02_observerPattern;

public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);		
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(74, 90, 29.2f);
		
		
		// --- Observable Class와 Observer Interface ---
		// Observer : 목격자, 보는 사람
		// Observable : 관측 가능
		
		
		// --- Observable Class ---
		//Observable은 obs라는 Vector를 지역변수로 (local variable) 가지고있다.
		//중요한 메소드는 아래와 같은 것들이 있다.
		//addObserver(Observable o)
		//notifyObserver(Observable o)
		//removeObserver(Observalbe o)
		
		// --- Observer Interface ---
		//Observer 인터페이스를 상속한 모든 클래스는 Observer Interface에서 가지고 있는 notify라는 메소드를 상속해야한다.
		//update(Observable o, Object arg)
		
		// --- 제반사항 ---
		//weatherData는 Observable를 확장(extend)한다.
		//CurrentConditionDisplay는 Observer를 승계(implement)한다.
				
		
		
		// --- 옵저버 패턴의 흐름---
		
		// (1) CurrentConditionDisplay가 weatherData의 옵저버가 되는 과정
		// 기본적으로 Display는 weatherData의 지역변수가 바뀔 때 마다 해당 내용을 보고받고 자신의 지역변수도 바꾸고 싶어한다.
		//CurrentConditionDisplay의생성자에는 weatherData가 매개변수로 들어간다.
		//매개변수로 등록된 weatherData는 Observable의 확장이므로 addObserver 메소드를 가지고있다
		//해당 메소드를 이용하여 Observer 인터페이스의 상속클래스인 CurrentConditionDisplay를 Observer로 등록하게 된다.
		//
		// (2) weatherData가 바뀌면 Observer인 CurrentConditionDisplay도 업데이트된다!
		// weatherData가 바뀔때는 자신의 옵저버들에게 바뀐 내용을 알려줘야한다. 그 과정은 아래와 같다.
		//setChanged()를 호출한다. 해당 메소드는 observable 클래스의 매개변수인 changed를 true로 변경시켜준다. (기본값 false)
		//weatherData에서 notifyObserver()를 호출한다. 호출한 메소드는 옵저버들에게 해당 내용을전달해주기 위한 메소드이다.
		//notifyObserver()는 changed가 true일때만 작동한다.
		//notifyObserver()는 이제 Vector로 등록되어있는 모든 Observer들을 배열로바꾸어서 반복문을 이용해 Observer의 update()메소드를 계속 실행시킨다.
		//즉, Observer인 CurrentConditionDisplay는 update()메소드를 실행하게 된다.
		//이 업데이트 메소드는 자기자신의 멤버변수들인 온도와 습도를 업데이트하며, 업데이트가 될때마다 Display되게 한다!
				
	}
	
}
