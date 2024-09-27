package com.pcwk.ehr.ed02;

public class J01Varargs {

	public static int sum(int ... numbers) {
		int total = 0;
		
		for(int num :numbers) {
			total += num;
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1,2)); // 3
		
		System.out.println(sum(1,2,3,4,5)); // 15
		
		System.out.println(sum(1)); // 1
	}

}
