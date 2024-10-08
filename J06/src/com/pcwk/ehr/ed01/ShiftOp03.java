package com.pcwk.ehr.ed01;

public class ShiftOp03 {

	public static void main(String[] args) {
		int x = 8;
		
		//10진수를 2진수로 표현 : 10진수 8를 2진수로 1000 표현 
		System.out.printf("10진수 %d를 2진수로 %s 표현 %n",x , Integer.toBinaryString(x));
		
		int leftShift = x << 2;
		System.out.printf("%d << 2 = %d%n", x, leftShift); //8 << 2 = 32
		
		int rightShift = x >> 2;
		System.out.printf("%d >> 2 = %d%n", x, rightShift); // 8 >> 2 = 2
		
		int signRightShift = x >>> 2;
		System.out.printf("%d >>> 2 = %d%n", x, signRightShift); // 8 >>> 2 = 2
	
	}

}
