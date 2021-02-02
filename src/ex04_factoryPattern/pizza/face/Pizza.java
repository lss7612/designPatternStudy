package ex04_factoryPattern.pizza.face;

import java.util.ArrayList;

public abstract class Pizza {
	
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<>();
	
	public void prepare() {
		System.out.println(name+" 준비합니다.");
		System.out.println("Tossing dough...");
		System.out.println("Adding source...");
		System.out.println("Adding toppings");
		for(int i = 0; i < toppings.size(); i++) {
			System.out.println("\t"+toppings.get(i));
		}
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
	
	public String getName() {
		return name;
	};
	
}
