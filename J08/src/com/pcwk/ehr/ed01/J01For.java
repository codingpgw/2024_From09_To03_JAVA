package com.pcwk.ehr.ed01;

public class J01For {

	public static void main(String[] args) {
		// 1~5 출력하고, 합계구하기	
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);

	}

}
