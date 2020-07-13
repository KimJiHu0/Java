package com.test01_01;

//추상클래스 abstract class : 추상메소드를 하나 이상 가질 수 있는 클래스.
public abstract class Animal {
	//추상메소드 : body가없는 메소드를 의미한다.
	//public void classname(){}에서 {}부분을 body라고 칭한다.
	//추상메소드는 상속받는 자식클래스에서 반드시 구현해야한다.
	//new연산자를 이용해서 객체를 생성할 수 없다. 선언만 되어있고 구현이 되지 않았기 때문.
	
	//이 부분은 Animal class를 상속받는 자식class에서 반드시 구현해야한다.
	public abstract void bark();
	
	public void eat(String feed) {
		System.out.println(feed + "먹는다.");
	}
}
