package com.test01_01;

public class Cat extends Animal{
	
	//bark라는 메소드느 Animal class(부모클래스)에서 만들어진 추상메소드이기 때문에 자식 클래스에서 반드시 구현해야한다.
	public void bark() {
		System.out.println("야옹");
	}
	
	public void eat(String feed) {
		super.eat(feed);
	}
}
