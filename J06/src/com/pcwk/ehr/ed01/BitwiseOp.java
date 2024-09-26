package com.pcwk.ehr.ed01;

public class BitwiseOp {

	public static void main(String[] args) {
		int x = 42;
		String binaryString42 = Integer.toBinaryString(x);
		
		int y = 51;
		String binaryString51 = Integer.toBinaryString(y);
		
		//42의 2진수 표현 : 101010
		System.out.printf("정수 : %d의 2진수 표현 : %s%n",x, binaryString42);
		
		//51의 2진수 표현 : 110011
		System.out.printf("정수 : %d의 2진수 표현 : %s%n",y, binaryString51);
		
		System.out.println("===============================================");
		
		//AND
		System.out.printf("x & y = %d%n", (x&y));
		
		//OR
		System.out.printf("x | y = %d%n", (x|y));
		
		//XOR
		System.out.printf("x ^ y = %d%n", (x^y));
		
		//NOT
		System.out.printf("~x = %d, ~y = %d%n",~x, ~y);
		
		
	}

}
