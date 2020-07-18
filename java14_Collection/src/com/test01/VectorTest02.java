package com.test01;

import java.util.Vector;

public class VectorTest02 {
	
	public static void main(String[] args) {
		//타입은 String타입이기 때문에 String만들어갈 수 있다.
		Vector<String> v = new Vector<String>();
		
		v.add("윤용민");
		v.add("위영석");
		v.add("김지후");
		v.add("강호동");
		v.add("조세호");
		v.add("이순신");
		v.add("홍길동");
		//prn(v);
		trans(v);
		
		
	}
	public static void prn(Vector<String> v) {
		//향상된 for문, forEach문
		//for( 값을 받을 수 있는 변수. : arrays[] or collection() )
		for(String element : v) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	public static void trans(Vector<String> v) {
		//1. 홍길동의 인덱스를 찾고,
		//   해당 인덱스의 값을  "홍길순"으로 바꾸자.
		//2. "~~신"으로 끝나는 객체를 찾고,
		//   만일 있다면, "신"을 "자"로 바꾸자.
		//3. 마지막 글자가 "호"인 이름을 찾고,
		//   만일 있다면, 삭제하자.
		//System.out.println(vector);
		v.set(v.indexOf("홍길동"), "홍길순");
		//System.out.println(v.indexOf("홍길동")); 홍길동의 index를 찾는 명령어.
		//v.set(6, "홍길순"); index 6번지에 있는 것을 "홍길순" 으로 바꾸는 명령어.
		System.out.println(v);
		
		System.out.println("==============================================");
		
		for(int i = 0; i < v.size(); i++) {
			//System.out.print(vector.get(i) + " ");
			if(v.get(i).endsWith("신")) {
				//vector.get(i) 는 String 타입이기 때문에 값이 변하지 않는다.
				v.set(i, v.get(i).replace("신", "자"));
			}
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		//System.out.println(v.get(1));
		
		
		
		System.out.println("==============================================");
		
		//forEach문이 돌 때 값이 변경되거나 삭제되면 오류발생.
		for( String element : v ) {
			if( element.endsWith("호")) {
				//vector.remove(element);
				//break; 하나만 삭제할 땐 break를 써줘도 되지만 여러개 삭제하려면 사용 불가능.
			}
		}
		
		for(int i = 0; i < v.size(); i++) {
			if(v.get(i).endsWith("호")) {
				v.remove(i);
			}
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("==============================================");

		
	}

}
