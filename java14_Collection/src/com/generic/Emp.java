package com.generic;

//t : type
//설계도에 어떤 타입이 들어올지 몰라서 선언해준 것
public class Emp<T> {
	
	//T를 쓸 수 있는건 위에 클래스에서 <T>를 선언해줬기 때문에 사용 가능.
	
	//Emp<Integer> bCompany = new Emp<Integer>(7890, "이순신");
	//MTest에 <Integer>을 해줌에도 String타입이 들어가는 이유는 위에 클래스에
	//Emp<T>가 밑에 private T empno;  에만 적용이 되고
	//뒤에 들어오는 "이순신"은 private String ename; 에 적용되기 때문이다.
	private T empno;
	private String ename;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(T empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}
	public T getEmpno() {
		return empno;
	}
	public void setEmpno(T empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	

}
