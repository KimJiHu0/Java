package com.test03;

import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		//추가와 동시에 정렬.
		set.add("5. 일");
		set.add("1. 오");
		set.add("3. 삼");
		set.add("4. 이");
		set.add("2. 사");
		System.out.println(set);
		
		
	}

}
