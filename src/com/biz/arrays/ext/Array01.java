package com.biz.arrays.ext;

public class Array01 {
	
	public static void main(String[] args) {
		
		// 숫자형 배열은 배열을 선언하면
		// 모든 요소의 값들이 0으로 자동 초기화 된다.
		int[] arrNum = new int[10];
		
		for(int i = 0; i < arrNum.length;i++) {
			System.out.println(arrNum[i]);
			
		}
		String s1 = "Republic of Korea";
		System.out.println(s1.length());
		// 문자열형 배열은 배열을 선언하면 모든 요소의 값들이 ""으로
		// 초기화 된다 . 단 , sysout...을 사용해서 console에 보이면
		// null 값으로 표현되는데 실제 null값하고는 다소 차이가 있다.
		
		// 문자열 배열요소를 이용해서 문자열 변수의 확장기능들(.length())을 
		// 사용하려고하면 사용할 수 없다.
		
		// 따라서 문자열 배열에서 추출한 요소는 어떤 값(문자열)을 저장하기 전에는
		// 읽기 명령을 실행하면 NullpointException이 발생을 한다.
		String[] arrString = new String[10];
		for(int i = 0 ; i < arrString.length;i++) {
			System.out.println(arrString[i]);
		}
		
		
	}

}
