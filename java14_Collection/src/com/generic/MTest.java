package com.generic;

public class MTest {
	
	public static void main(String[] args) {
		Emp<String> aCompany = new Emp<String>();
		aCompany.setEmpno("A1111");
		aCompany.setEname("홍길동");
		
		//Emp가 Integer타입이지만 String타입이 들어가는 건, Emp클래스에서 Emp<T>는  Empno 타입을 말하는 것이고
		//그 뒤에 Ename는 String타입이기 때문에 7890과 이순신이 동시에 들어갈 수 있다.
		Emp<Integer> bCompany = new Emp<Integer>(7890, "이순신");
		
		//Emp cCompany = new Emp(123.456, "김선달");
		Emp<Double> cCompany = new Emp<Double>(123.456,"김지후");
		
		//String을 제네릭에 넣어줘서 String만 써야함.
		System.out.print(aCompany.getEmpno() + " ");
		System.out.println(aCompany.getEname());
		//Integer로 선언했기 때문에 int타입
		System.out.print(bCompany.getEmpno() + " ");
		System.out.println(bCompany.getEname());
		//뭐가 들어올지 몰라서 Object
		System.out.print(cCompany.getEmpno() + " ");
		System.out.println(cCompany.getEname());
	}

}
