package com.score01;

public class score {
	
	//이름, 국어, 영어, 수학 변수 선언
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//기본생성자
	public score() {
		
	}
	//파라미터 4개받는 생성자
	public score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	//총점 getter
	public int getSum() {
		int sum = kor + eng + math;
		return sum;
	}
	//평균 getter
	public double getAvg() {
		double avg = (double)(getSum()) / 3.0;
		return avg;
	}
	
	//100 - 90 : A
	//89 - 80 : B
	//79 - 70 : C
	//69 - 60 : D
	//59 - 0 : F
	public String getGrade() {
		if(getAvg() <= 100 && getAvg() >= 90) {
			return "A";
		}  else if(getAvg() <= 89 && getAvg() >= 80) {
			return "B";
		} else if(getAvg() <= 79 && getAvg() >= 70) {
			return "C";
		} else if(getAvg() <= 69 && getAvg() >= 60) {
			return "D";
		} else if(getAvg() <= 59 && getAvg() >= 0) {
			return "F";
		}
		return "";
	}
		
		//이름 : x  국어 : x   영어 : x   수학 : x
		//총점 : x  평균 : x   등급 : x
		//로 리턴.
		public String toString() {
			return "이름 : " + getName() + " 국어 : " + kor + " 영어 : " + eng + " 수학  : " + math + " \n "
					+ " 총점 : " + getSum() + " 평균 : " + String.format("%.2f", getAvg()) + " 등급 : " + getGrade();
		}
	
}
