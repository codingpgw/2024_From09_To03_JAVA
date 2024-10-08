package com.pcwk.ehr.ed01;

public class J04ArrayCopyAPI {
	
	public static void display(int[] score) {
		//score 자체 출력
		for(int i=0; i<score.length; i++) {
			System.out.printf("score[%d] = %d\n",i,score[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] iArr = {77,88,99,95,76};
		
		int[] targetArr = new int[iArr.length * 2];
		
		System.out.println("Before");
		display(targetArr);
		
		//배열 copy
		System.arraycopy(iArr, 0, targetArr, 0, iArr.length);
		System.out.println("After");
		display(targetArr);
		
	}

}
