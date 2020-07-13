package com.test01_01;

public class Dog extends Animal{
	
	public void bark() {
		System.out.println("멍멍");
	}
	
	//이 부분은 부모클래스에서 만든 
	//System.out.println(feed + " 먹는다. ");형식을
	//재정의해준 것이다.
	public void eat(String feed) {
		System.out.println("멍멍이가" + feed + "먹는다.");
	}
}
