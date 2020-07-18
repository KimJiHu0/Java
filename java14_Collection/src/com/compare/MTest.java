package com.compare;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MTest{
	
	public static void main(String[] args) {
		//Score 배열에 Score 객체 3개 저장하자.
		//
		Score friend01 = new Score("윤용민",87,97,89);
		
		Score friend02 = new Score();
		friend02.setName("위영석");
		friend02.setKor(98);
		friend02.setEng(89);
		friend02.setMath(78);
		
		Score friend03 = new Score("김지후",88,79,98);

		Score[] school = new Score[4];
		school[0] = friend01;
		school[1] = friend02;
		school[2] = friend03;
		school[3] =  new Score("배민경", 89, 90, 79);
		
		Arrays.sort(school);
		for(Score sc : school) {
			System.out.println(sc);
		}
		
	
		
		
	}

}
