package com.test03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest02 {

	public static void main(String[] args) {

		Score s01 = new Score("위영석", 97, 89, 98);
		Score s02 = new Score("윤용민", 89, 98, 96);
		Score s03 = new Score("김지후", 99, 80, 100);

		Set<Score> school = new HashSet<Score>();
		school.add(s01);
		school.add(s02);
		school.add(s03);
		// System.out.println(s01);
		// System.out.println(s02);
		// System.out.println(s03);
		 prn(school);
		// trans(school);
	}

	public static void trans(Set<Score> set) {
		// set에서 이름이 위영석인 Score 객체를 찾아서,
		// 국어 점수를 0점으로 변경 후 전체 출력하자
		// 단 iterator 사용
		Iterator<Score> iterator = set.iterator();

		while (iterator.hasNext()) {
			Score tmp = iterator.next();
			if (tmp.getName().equals("위영석")) {
				tmp.setKor(0);
			}
		}
		for(Score sc : set) {
		System.out.println(sc);
	}
	}

	public static void prn(Set<Score> set) {
		// 방법 1 forEach문으로 바꿔서 출력
		for (Score sc : set) {
			System.out.println(sc.getName());
		}
		System.out.println();
		// 방법 2 객체배열로바꿔서 출력
		Object[] arr = set.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(((Score) arr[i]).getName());
		}
		System.out.println();

		// 방법 3
		// iterator = 컬랙션 내부의 값을 순회하는 표준화된 방법.
		Iterator<Score> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
		System.out.println();

	}

}
