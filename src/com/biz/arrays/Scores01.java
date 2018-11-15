package com.biz.arrays;

public class Scores01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어선생님이 어느반 학생 5명의 국어점수 합계를 계산하고자 한다.
		// 변수를 선언해서 5명 학생의 국어 점수를 저장해두고 
		// 총점을계산
		
		int intKor1 =0;
		int intKor2 =0;
		int intKor3 =0;
		int intKor4 =0;
		int intKor5 =0;
		
		intKor1 = 77;
		intKor2 = 92;
		intKor3 = 76;
		intKor4 = 89;
		intKor5 = 100;
		
		int intSum = 0;
		intSum = intKor1 +intKor2 +intKor3 +intKor4 +intKor5;
		System.out.println("총점:" + intSum);

	}

}
