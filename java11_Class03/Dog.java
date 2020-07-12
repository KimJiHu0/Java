package com.test02_1;

public class Dog extends Animal{
	
	public Dog() {
		System.out.println("강아지");
	}
	
	//override해줬지만 부모가 가진 bark를 먼저 호출해준다.
	//" 울음소리 : "가 먼저 출력이 된 후에 자식class에서 출력해주는 명령문이 실행
	public void bark() {
		super.bark();
		System.out.println("멍멍!");
	}

}
