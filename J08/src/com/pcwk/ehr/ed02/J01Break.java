package com.pcwk.ehr.ed02;

public class J01Break {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while(true) {
			if(sum > 88) {
				break;
			}
			sum +=i;
			++i;
			System.out.printf("i = %d, sum = %d%n",i,sum);
		}
//		System.out.printf("i = %d, sum = %d%n",i,sum);
		
	}

}
