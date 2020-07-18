package com.test01;

import java.util.Vector;

public class VectorTest01 {
	//Vector : 순서가 있고, 중복이 있어서 꺼낼 떄에는 for문과 forEach문을 사용 할 수 있다.
	//for(int i = 0; i < varname.length; i ++) { }
	//for(String e : varname) { }
	
	public static void main(String[] args) {
		//생성자를 만들어주고, 10만큼의 크기 배열을 만들어주고, overflow될 때에는 5칸을 더 만들어준다.
		Vector<Integer> v = new Vector<Integer>(10,5);
		//v.size = v안에 들어가있는애들의 크기, capacity = 최대크기.
		System.out.println(v.size() + " : " + v.capacity());
		
		for(int i = 0; i < 9; i++) {
			v.add(i);
		}
		System.out.println(v.size() + " : " + v.capacity());
		//내부적으로 toString이 overriding 되어있다.
		System.out.println(v);
		
		//v.add(); 는 값을 넣어주는 것.
		v.add(9);
		System.out.println(v.size() + " : " + v.capacity());
		System.out.println(v);
		
		
		v.add(10);
		System.out.println(v.size() + " : " + v.capacity());
		System.out.println(v);
		
		System.out.println("====================================================");
		
		Vector<Double> v1 = new Vector<Double>(10,5);
		System.out.println(v1.size() + " : " + v1.capacity());
		for(double i = 0; i < 10; i++) {
			v1.add(i);
		}
		System.out.println(v1);
		System.out.println(v1.size() + " : " + v1.capacity());
		
		v1.add(0.2);
		System.out.println(v1);
		System.out.println(v1.size() + " : " + v1.capacity());
		
		for(double a : v1) {
			System.out.print(a + " ");
		}
		
		System.out.println("======================================================");
		
		Vector<String> v2 = new Vector<String>(10,5);
		
		v2.add("1");v2.add("hi");v2.add("who");v2.add("wow");v2.add("we");v2.add("ga");v2.add("하이");v2.add("5");v2.add("9");v2.add("JAVA");
		
		System.out.println(v2);
		
		System.out.println(v2.size() + " : " + v2.capacity());
		
		v2.add("1");
		
		System.out.println(v2.size() + " : " + v2.capacity());
		
		System.out.println(v2);
		
		for(String n : v2) {
			System.out.print(n + " ");
		}
		
		System.out.println("========================================================");
		
		Vector<Object> v3 = new Vector<Object>(10,5);
		
		v3.add("hi"); v3.add(10); v3.add(10.2);
		
		System.out.println(v3);
		
		for(int i = 0; i < v3.size(); i++) {
			System.out.print(v3.get(i) + " ");
		}
		System.out.println();
		
		for(Object v3_1 : v3) {
			System.out.print(v3_1 + " ");
		}
	}

}
