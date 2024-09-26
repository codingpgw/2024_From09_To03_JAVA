package com.pcwk.ehr.ed02;

public class ArithmeticOp {

	public static void main(String[] args) {
		int a = 13;
		int b = 15;
		
		//덧셈 연산
		int sum = a + b;
		System.out.printf("%d + %d = %d \n",a ,b, sum);
		
		//뺄셈 연산
		int difference = a - b;
		System.out.printf("%d - %d = %d \n",a ,b, difference);
		
		//곱셈 연산
		int product = a * b;
		System.out.printf("%d * %d = %d \n",a ,b, product);
		
		//나눗셈 : int / int -> int
		a = 11;
		b = 2;
		System.out.printf("%d / %d = %d \n",a , b, (a/b));
		
		float c = 2.0f;
		System.out.println(a/c);// int/float -> float/float -> float
		
		//나머지 연산
		int remainder = a % b;
		System.out.printf("%d %% %d = %d%n",a , b, remainder);
		
	}

}
