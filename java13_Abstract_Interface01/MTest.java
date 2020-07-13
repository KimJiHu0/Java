package com.test01_01;

public class MTest {
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		//dog과 cat 클래스에서 구현한 bark메소드 호풀
		dog.bark();
		cat.bark();
		
		//new연산자를 통해 객체생성이 불가능하다.
		//부모변수 = new 자식(); 으로 가능
		//Animal animal = new Animal();
		
		//super class에서 eat method는 (String feed)를 파라미터로 주었으니
		//호출할 때 아규먼트 값을 주어야한다.
		dog.eat("밥");
		cat.eat("간식");
		
		//dog는 dog class에서 eat 메소드를 재정의해줘서 재정의한 결과가 출력되고
		//cat은 부모클래스의 eat을 가져다 써서 그대로 출력될 것이다.
	
	}
}
