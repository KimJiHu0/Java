package com.test02_1;

public class MTest {

	public static void main(String[] args) {

		//cat과 dog class의 기본생성자를 호출해준다.(사용해준다는 의미)
		Cat cat = new Cat();
		Dog dog = new Dog();
		//기본생성자 호출시 Animal class의 기본생성자 선 호출하고 자식클래스의 기본생성자 호출
		//동물 : 고양이
		//동물 : 강아지
		
		//cat은 bark메소드를 구현할 떄 super.bark()를 생략했기 때문에 울음소리 : 라는 문구 안나옴.
		cat.bark();
		//야옹
		dog.bark();
		//울음소리 : 멍멍!
		
		System.out.println(cat.hashCode());
		System.out.println(dog.hashCode());
		
		System.out.println("=======================");
		
		//같은 타입이지만 여러개의 타입을 가질 수 있다.
		//부모객체에 dog객체와 cat객체를 담아서 한번에 실행했다?
		Animal someone = new Dog();
		someone.bark();
		
		someone = new Cat();
		someone.bark();
		
		System.out.println("=======================");
		
		//instanceof : 이 객체가 이 타입에 있니?라는 의미.someone이라는 애에 Dog라는애가 있니?
		//마지막에 들어간 애만 인식해서 고양이 출력
		if(someone instanceof Dog) {
			System.out.println("강아지");
		} else if(someone instanceof Cat) {
			System.out.println("고양이");
		}
		/*
		 * [다형성]
		 * 1. 부모 타입으로 자식 생성.
		 * 	  Parent p = new Child();
		 * 2.부모 이름으로 자식 대입.
		 * 	  Child c = new Child();
		 * 	  Parent p = c;
		 * 3.부모의 메서드를 통해 자식 메서드 호출
		 * 
		 * 같은 부모를 갖고 있는 자식 클래스는
		 * 컴파일시 형변환 가능하지만,
		 * 런타임시 ClassCastException.
		 */
	}

}
