package com.biz.arrays.chars;

public class StringChar06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strText = "나는 자랑스러운 태극기 앞에 자유롭고 정의로운 대한민국의";
		strText += "무궁한 영광을 위하여 충성을 다할것을 굳게 다짐합니다";
		
		// 문자열을 char[]로 
		char[] charText = strText.toCharArray();
		int TextLength = charText.length;
		
		char[] keyText = new char[TextLength];
		
		// 암호화를 위한 key 뭉치 생성
		for(int i = 0 ; i <TextLength; i ++) {
			keyText[i] =(char)(Math.random()* (int)('Z' - 'A'));
		}
		
		// 원본문자열과 키 뭉치를 연산해서
		// 암호화된 문자열(char 배열)을 생성
		char[] secText = new char[TextLength];
		for (int i = 0 ; i < TextLength;i++) {
			secText[i]  = (char)(charText[i] + keyText[i]);
		}
		
		// 암호화된 문자열을 보여주기
		for(int i : secText) {
			System.out.print((char)i + ", ");
		}
		System.out.println();
		
		// 암호화된 문자열에서 키 뭉치와연산을 해서
		// 원본 문자열을 복원
		for(int i = 0 ; i < TextLength; i ++) {
			System.out.print((char)(secText[i] - keyText[i]));
		}
		System.out.println();
		
		



	}

}
