package com.test03_1;

public class MySum {

	//overload(ing) : 같은 이름으로 다른 기능을 한다.
	//ex) sum이라는 같은 이름으로 여러 기능을 수행.
	//파라미터의 타입이나 리턴 타입이 달라도 가능하고 갯수만 달라지면 된다.
	
	//파라미터 하나 받아서 그 하나받은것에 똑같은것을 +해준다.
	//Main class에서 아규먼트로 10을 넣었다면
	//파라미터로 10이들어오고 10+10이 되어서 20이 리턴된다.
	public int sum(int i) {
		return i + i;
	}
	
	//파라미터를 i와j 2개를 받아왔다.
	//Main class에서 아규먼트로 값을 2개 넣었을 떄
	//두개를 더해서 리턴해준다.
	public int sum(int i, int j) {
		return i + j;
	}
	
	//타입이 달라도 된다.
	public double sum(double d, double f) {
		return d + f;
	}
	
	//파라미터의 갯수가 달라도 된다.
	public int sum(int i, int j, int k) {
		return i+j+k;
	}
}
