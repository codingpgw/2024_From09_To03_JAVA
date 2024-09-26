package com.pcwk.ehr.ed01;

public class J01ArrayIndex {

	public static void main(String[] args) {
		// 배열의 크기가 5인 정수 배열 생성
		int[] score = new int[5];
		
		//배열 요소에 값 할당
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;
		
		//배열 요소 값 출력
		System.out.println("배열 첫 번째 요소 : "+score[0]);
		System.out.println("배열 두 번째 요소 : "+score[1]);
		System.out.println("배열 세 번째 요소 : "+score[2]);
		System.out.println("배열 네 번째 요소 : "+score[3]);
		System.out.println("배열 다섯 번째 요소 : "+score[4]);
		
		//반복문 사용 배열 요소 접근
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		System.out.println("===============");
		for(int scores : score) {
			System.out.println(scores);
		}
		
//		int[] score99 = new int[]{10,20,30,40,50};
		
	}

}
