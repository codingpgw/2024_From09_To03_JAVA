package com.pcwk.ehr.ed01;

public class AssignOp04 {

	public static void main(String[] args) {
		int x = 5;
		
		System.out.printf("x = %d%n",x);
		
		// x += 3;
		System.out.printf("x += 3 => %d%n",(x+=3));
		x = 5;
		//x *= 3;
		System.out.printf("x *= 3 => %d%n",(x*=3));
		x = 5;
		//x %= 3;
		System.out.printf("x %%= 3 => %d%n",(x%=3));
		x = 5;
		System.out.printf("x <<= 3 => %d%n",(x<<=3));
		x = 5;
		System.out.printf("x &= 3 => %d%n",(x&=3));
		
		
	}

}
