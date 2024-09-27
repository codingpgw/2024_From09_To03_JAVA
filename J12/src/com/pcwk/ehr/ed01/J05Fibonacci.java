package com.pcwk.ehr.ed01;

public class J05Fibonacci {
	public static int fibonacci(int n) {
		
		//재귀 호출은 반복문 보다 효율은 떨어진다.
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	public static void main(String[] args) {
		
		int n = 10;
		
		int result = fibonacci(n);
		
		System.out.printf("result : %d",result);
		//result : 55
	}

}
