package com.pcwk.ehr.ed01;

public class J01FunctionParamPrimitiveType {

	public static void modifyPrimitive(int num) {
		num = 15;
	}
	
	public static void main(String[] args) {
		int x = 13;
		
		modifyPrimitive(x);
		
		System.out.printf("x = %d\n",x); //x = 13
		
	}

}
