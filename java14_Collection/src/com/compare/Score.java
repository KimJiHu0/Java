package com.compare;



public class Score implements Comparable<Score>{

	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Score() {
		
	}
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
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
	public int getSum() {
		int sum = kor + eng + math;
		return sum;
	}
	public double getAvg() {
		double avg = (double)getSum() / 3;
		return avg;
	}
	public String getGrade() {
		String res = "";
		switch((int)getAvg() / 10) {
		case 10 :
		case 9 :
			res = "A";
			break;
		case 8 :
			res = "B";
			break;
		case 7 :
			res = "C";
			break;
		case 6 :
			res = "D";
			break;
		default :
			res = "F";
		}
		return res;
	}
	
	public String toString() {
		return "이름 : " + name + " 국어 : " + kor + " 영어 : " + eng + " 수학 : " + math + "\n" + 
				"총점 : " + getSum() + " 평균 : " + String.format("%.2f", getAvg()) + " 학점 : " + getGrade() + " \n ";
	}
	@Override
	//나의 것과 다른것의 비교 compareTo..
	public int compareTo(Score other) {
		//정렬메소드.
		//Score other = (Score o);
		/*
		 * 1이면 앞의 인자가 더 큰 값
		 * 0이면 같은 값
		 * -1이면 뒤의 인자가 더 큰 값
		 */
		//내가 더 크면 +
		//다른애가 더 크면 -
		//같으면 0
		
		if(this.getAvg() > other.getAvg()) {
			return -1;
		} else if(this.getAvg() < other.getAvg()) {
			return 1;
		} else {
			if(this.getKor() > other.getKor()) {
				return -1;
			} else if(this.getKor() < other.getKor()){
				return 1;
			}
			return 0;
		}
		
		
		//return this.getName().compareTo(other.getName());
	}
}
