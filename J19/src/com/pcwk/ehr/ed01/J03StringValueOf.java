package com.pcwk.ehr.ed01;

public class J03StringValueOf {

	public static void main(String[] args) {
		int age = 22;
		
		String str = String.valueOf(age);
		String str2 = age+"";
		System.out.println(str);//22
		System.out.println(str.equals(str2)); //true
		
		int sage = Integer.parseInt(str);
		System.out.println(sage == age); //true
		
		System.out.println("===========================");
		double dValue = 22.0;
		String strD = String.valueOf(dValue);
		System.out.println(strD.equals(dValue)); //false


	}

}
