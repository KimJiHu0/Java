package com.test03;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest03 {
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		//순서 x 중복 x
		set.add("하이");
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(4);
		set.add("바이");
		set.add("헬로");
		set.add(10.2);
		
		System.out.println(set);
		
		for(Object s : set) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//중복x 순서o
		LinkedHashSet set1 = new LinkedHashSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add("hi");
		set1.add("bye");
		set1.add(5);
		set1.addAll(set);
		
		System.out.println(set1);
	}

}
