package com.pcwk.ehr.ed01;

public class J04Factorial {
	
	public static int factorial(int n) {
		
		if(n == 1) {
			return 1;
		}
		
		return n * factorial(n - 1);
	}
	public static void main(String[] args) {
		int number = 5;
		
		int result = factorial(number);
		
		System.out.printf("%d! = %d\n",number, result);
		//5! = 120

	}

}
