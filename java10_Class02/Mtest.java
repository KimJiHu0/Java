package com.score01;

public class Mtest {

	public static void main(String[] args) {
		//객체 배열 생성
		//같은 패키지 내에서 만들었던 score class사용.
		score[]arr = new score[2];
		//만들어놓은 배열안에 파라미터4개받는 생성자를 이용해서 값을 대입
		arr[0] = new score("홍길동", 89, 56, 97);
		arr[1] = new score("이순신", 78, 87, 99);
		//출력을 하게되면 score class에서 만든 to String메소드로 인하여 
		//이름 : 홍길동 국어 : 89 영어 : 56 수학  : 97 
		//총점 : 242 평균 : 80.67 등급 : B
		//형식으로 출력
		System.out.println(arr[0]);
		
		//sae라는 이름을 가진 score객체 기본생성자
		score sae = new score();
		//이름, 점수를 대입해서 setter로 값을 초기화 시켜준다.
		sae.setName("세종대왕");
		sae.setKor(100);
		sae.setEng(0);
		sae.setMath(100);
		System.out.println(sae);
		
		//파라미터 4개받는 생성자를 이용해서 출력
		score kang = new score("강감찬", 89, 97, 67);
		System.out.println(kang);

	}

}
