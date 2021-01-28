package ex04_factoryPattern;

public abstract class Pizza {
	
	public void prepare() {
		System.out.println("피자 준비 중");
	}
	
	public void bake() {
		System.out.println("피자 굽는 중");
	}

	public void cut() {
		System.out.println("피자 커팅");
		
	}

	public void box() {
		System.out.println("피자 박싱");
	}
	
}
