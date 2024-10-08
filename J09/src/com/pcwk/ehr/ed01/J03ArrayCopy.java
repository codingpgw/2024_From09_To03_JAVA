package com.pcwk.ehr.ed01;

public class J03ArrayCopy {
	
	public static void display(int[] score) {
		//score 자체 출력
		for(int i=0; i<score.length; i++) {
			System.out.printf("score[%d] = %d\n",i,score[i]);
		}
	}
	
	public static void main(String[] args) {
		//배열 copy
		//1. 기존 배열보다 큰 배열을 생성한다.
		//2. 기존 배열을 신규 배열에 copy
		//3. 기존 배열에 신규 배열 주소를 할당한다.
		
		int[] iArr = {77,88,99,95,76};
		//1
		int[] iArrCo = new int[iArr.length * 2];
		System.out.println("Before");
		display(iArrCo);
		
		//2
		for(int i=0; i<iArr.length; i++) {
			iArrCo[i] = iArr[i];
		}
		System.out.println("Copy");
		display(iArrCo);
		
		//3
		System.out.println("iArr : " + iArr);
		System.out.println("iArrCo : " + iArrCo);
		
		iArr = iArrCo;
		
		System.out.println("주소번지 수정");
		System.out.println(iArr);
		
		//동일 주소번지를 가르키고 있으므로 
		//iArr[0] 값을 변경하면, iArrCo[0]에도 동일하게 적용
		iArr[0] = 100;
		
		System.out.println(iArrCo[0]);
		
	}

}
