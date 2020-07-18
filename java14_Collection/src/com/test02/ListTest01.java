package com.test02;

import java.util.List;

import com.test03.Score;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest01 {
	

	public static void main(String[] args) {
		
		List List = new ArrayList();
		List.add("String");
		List.add(100);
		List.add("101");
		List.add(null);
		List.add(102);
		List.add(10.2);
		System.out.println(List);
		
		//for(int i = 0; i < List.size(); i++) {
			//System.out.println(Integer.parseInt(List.get(i) + " "));
			
		//}
		System.out.println("============================================");
		
		Iterator<Object> iterator = List.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		System.out.println("=================================================");
		
		for(Object sc : List) {
			System.out.print(sc + " ");
		}
		System.out.println();
		
		
		System.out.println("=================================================");
		
		List<String> list = new ArrayList<String>();
		list.add("윤용민");
		list.add("위영석");
		list.add("김지후");
		list.add("신동엽");
		list.add("조세호");
		list.add("이순신");
		list.add("홍길동");
		
		System.out.println(list);
		
		System.out.println("======================================================");
		
		trans(list);
	}
	public static void trans(List<String> list) {
		//1. 홍길동을 김길동으로 바꾸자.
		list.set(list.indexOf("홍길동"), "김길동");
		System.out.print(list + " ");
		System.out.println();
		
		System.out.println("=========================================================");
		
		//2. ~신으로 끝나는 객체를 찾아서, ~자로 바꾸자.
		//List에는 순서가 있기 때문에 for(int i = 0; i < list.length; i++) {} 가 가능
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).endsWith("신")) {
				list.set(i, list.get(i).replace("신", "자"));
			}
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("==============================================================");
		//3.호로 끝나는 객체를 찾아서 삭제하자.
		
		for(int i = 0; i < list.size(); i ++) {
			if(list.get(i).endsWith("호")) {
				list.remove(i);
			}
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
	
}
