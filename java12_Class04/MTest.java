package com.test03_1;

public class MTest {

	public static void main(String[] args) {


		//MySum이라는 class를 사용하기위한 기본생성자를 호출
		MySum sum = new MySum();
		
		System.out.println(sum.sum(10));
		//파라미터 하나받는 생성자를 호출해서 10+10 = 20
		System.out.println(sum.sum(10.2, 12.9));
		//double타입 파라미터 2개받는 생성자 호출해서 10.2 + 12.9 = 23.1
		System.out.println(sum.sum(30, 40));
		//int타입 파라미터 2개받는 생성자 호출해서 30+40 = 70
		System.out.println(sum.sum(10, 20, 30));
		//파라미터 3개받는 생성자 호출해서 10 + 20 + 30 = 60

	}

}
