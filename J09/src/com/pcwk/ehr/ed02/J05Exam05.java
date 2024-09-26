package com.pcwk.ehr.ed02;

public class J05Exam05 {

	public static void main(String[] args) {
		int[] num = {4,4,3,7,2,8,2,9,3,8};
		
		int[] count = new int[10];
		for(int i = 0; i < num.length; i++) {
			count[num[i]] ++;
		}
		for(int j = 0; j < count.length; j++) {
			System.out.printf("%d : %d번 나왔습니다.%n",j,count[j]);
		}
		
	}

}
