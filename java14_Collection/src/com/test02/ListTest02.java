package com.test02;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListTest02 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		for(int i = 1; i <= 10; i ++) {
			//int a = (int)(Math.random()*10) + 1;
			list.add(i+ "");
		}
		System.out.println(list);
		//섞어주는 명령어.
		Collections.shuffle(list);
		System.out.println(list);
		Collections.sort(list, new MySortTest());
		System.out.println(list);
	}

}
class MySortTest implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		//String을 int형으로 형변환.
		//int형을 String하려면. Integer.toString();
		int tmp01 = Integer.parseInt(o1);
		int tmp02 = Integer.parseInt(o2);
		
		if(tmp01 > tmp02) {
			//양수면 1
			return 1;
		} else if( tmp01 < tmp02) {
			//음수면 -1
			return -1;
		}
		
		return 0;
	}
	
}