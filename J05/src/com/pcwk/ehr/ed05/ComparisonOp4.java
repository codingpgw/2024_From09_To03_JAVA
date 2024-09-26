package com.pcwk.ehr.ed05;

public class ComparisonOp4 {

	public static void main(String[] args) {
		
		String str01 = "abc";
		String str02 = new String("abc");
		
		System.out.printf("str01 = %s%n",str01);
		System.out.printf("str02 = %s%n",str02);
		
		System.out.println("==============================================");
		System.out.printf("str01 == \"abc\" => %b%n",(str01 == "abc"));
		System.out.printf("str02 == \"abc\" => %b%n",(str02 == "abc"));
		
		System.out.println("==============================================");
		//문자열 비교는 equals를 사용해야 함
		System.out.println(str01.equals("abc"));
		System.out.println(str02.equals("abc"));
		
		System.out.println(str01.equals(str02));
	}

}
