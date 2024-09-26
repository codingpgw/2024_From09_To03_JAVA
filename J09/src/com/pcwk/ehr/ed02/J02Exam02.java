package com.pcwk.ehr.ed02;

public class J02Exam02 {

	public static void main(String[] args) {
		int[] studentScore = {77,66,88,99,65,98,76,85};
		
		int max = studentScore[0];
		int min = studentScore[0];
		
		for(int i = 0; i < studentScore.length; i++) {
			if(max < studentScore[i]) {
				max = studentScore[i];
			}
			if(min > studentScore[i]) {
				min = studentScore[i];
			}
		}
		
		System.out.printf("max : %d, min : %d %n",max, min);
		
		
		

	}

}
