package com.pcwk.ehr.ed01;

public class J02ArrayInit {
	
	public static void display(int[] score) {
		//score 자체 출력
		for(int i=0; i<score.length; i++) {
			System.out.printf("score[%d] = %d\n",i,score[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] score = new int[5];
		
		display(score);
		
		System.out.println("======================");
		
		//배열 생성과 동시에 초기화
		int[] score02 = new int[] {10,20,30,40,50};
		display(score02);
		
		System.out.println("======================");
		//배열 생성과 동시에 초기화
		int[] score03 = {19,20,30,40,50};
		display(score03);
		
		int sum = 0;
		//score03 배열 평균
		for(int scores : score03) {
			sum += scores;
		}
		
		double avg = sum / (score03.length * 1.0);
		System.out.println(sum);
		System.out.println(avg);
		
	}

}
