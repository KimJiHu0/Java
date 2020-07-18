package com.test02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ListTest03 {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add("hi1");
		v.add("hi2");
		v.add("hi3");
		v.add("hi4");
		v.add("hi5");
		v.add("hi6");
		v.add("hi7");
		v.add("hi8");
		v.add(2, "hello");
		
		v.set(v.indexOf("hi1"), "who");
		
		System.out.println(v);
		
		//배열 고정.
		List<String> list1 = Arrays.asList("a", "b", "c");
		
		//고정된 배열이라 추가나 삭제가 안됌.
		//list1.add("d");
		//list1.remove("a");
		//변경은 가능.
		list1.set(0, "d");
		
		System.out.println(list1);
		
		List list = new ArrayList();
		
		//add의 기능 2가지.
		list.add("hello");
		list.add(1, "what");
		list.add("ㄱ");
		list.add("ㄴ");
		list.add("ㄷ");
		list.add(1);
		list.add(1.2);
		
		//인덱스에 있는 문자열을 바꾸는 것.
		list.set(list.indexOf("what"), "World");
		
		//hello라는 단어가 있는지 찾아주는 기능
		list.contains("hello");
		
		System.out.println(list.get(1));
		//collection이 비어있는지 안비어있는지 확인.
		System.out.println(list.isEmpty());
		//list의 size를 return
		System.out.println(list.size());
		//index에 위치한 객체 삭제.
		list.remove(0);
		System.out.println(list);
		//ㄱ이라는 객체 삭제.
		list.remove("ㄱ");
		System.out.println(list);
		//list에 있는 모든 객체를 삭제.
		list.clear();
		System.out.println(list);
	}

}
