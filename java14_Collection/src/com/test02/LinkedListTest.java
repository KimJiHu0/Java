package com.test02;

import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("딸기");
		list.add("포도");
		list.add("키위");
		list.add("수박");
		
		System.out.println(list);
		
		list.add(2, "참외");
		
		System.out.println(list);
	}

}
