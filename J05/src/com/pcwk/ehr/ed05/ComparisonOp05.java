package com.pcwk.ehr.ed05;

public class ComparisonOp05 {

	public static void main(String[] args) {
		int x = 13;
		
		System.out.printf("x = %2d \t (10 < x && x < 20) = %b %n",x, (10 < x && x < 20));
		
		x = 9;
		System.out.printf("x = %-2d \t (x %% 2 ==0) || (x %% 3 ==0) = %b %n",x,(x % 2 ==0) || (x % 3 ==0));
		
		char ch = '2';
		
		System.out.printf("ch = %c, %d \t %n",ch,(int)ch);
		System.out.printf("('0' <= ch && ch <= '9') = %b %n",('0' <= ch && ch <= '9') );
	}

}
