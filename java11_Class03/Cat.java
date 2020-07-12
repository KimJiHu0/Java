package com.test02_1;

//Animal class를 상속받는다는 의미.
//부모클래스에 있는 것들을 쓸 수 있다.
public class Cat extends Animal{

		public Cat() {
			//super();이 생략되어 있지만 자동으로 Animal class의 기본생성자를 가져온다.
			System.out.println("고양이");
		}
		
		public void bark() {
			//super.bark()가 생략되어있음
			//얘는 생략해주면 츌력이 안됌
			//야옹만 출력이 된다.
			System.out.println("야옹");
		}
}
