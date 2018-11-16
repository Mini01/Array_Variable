package com.biz.arrays.ext;

import javax.swing.plaf.synth.SynthStyleFactory;

import com.biz.arrays.service.GradeService;

public class ArrayGrade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GradeService[] arrGS = new GradeService[10];
		for(int i = 0 ; i < arrGS.length; i++) {	
			arrGS[i] = new GradeService();
			arrGS[i].gradeVO.setStrNum(""+(i+1));
			arrGS[i].gradeVO.setStrNum(String.valueOf(i+1));
			arrGS[i].makeScoreAll();
			arrGS[i].makeToatl();
	
		}
			
		
		
	
	
    makeline();
	System.out.printf("학번\t");
	System.out.printf("국어\t");
	System.out.printf("영어\t");
	System.out.printf("수학\t");
	System.out.printf("과학\t");
	System.out.printf("총점\t");
	System.out.printf("평균\n");
	
	for(int i = 0 ; i <arrGS.length; i++) {
		arrGS[i].viewGrade();
	}
		
		
	
	makeline();
	}
	
	

	
	public static void makeline() {
		for(int i = 0 ; i <50; i++) {
			System.out.print("=");
		}
		System.out.println();
		
	}

}
