package com.test03;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("3");
		set.add("4");
		set.add("6");
		set.add("5");
		
		//정렬된거 x set은 순서가 없음. 내부적으로 알아서 가지고 있는것뿐.
		//중복이 안된다.
		System.out.println(set);
		
		findElement(set,"3");
		removeElement(set, "3");
		System.out.println(set);
	}
	
	public static void findElement(Set<String> set, String find) {
		//set은 순서가 없기 때문에 for(int i = 0; i < set.size(); i++)이 안됌.
		for(String element : set) {
			if(element.equals(find)) {
				System.out.println(find + " 찾았다! ");
			}
		}
	}
	
	public static void removeElement(Set<String> set, String remove) {
		for(String element : set) {
			if(element.equals(remove)) {
				set.remove(element);
				break;
			}
		}
		//set.remove("4");
		//System.out.println(set);
	}
}
