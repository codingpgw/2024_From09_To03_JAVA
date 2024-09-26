package com.pcwk.ehr.ed04;

public class SignOp {

	public static void main(String[] args) {
		int x = -12;
		x = +x;
		System.out.printf("+x = %d%n",x);
		
		//초기화
		x = -12;
		x = -x;
		System.out.printf("-x = %d%n",x);

	}

}
