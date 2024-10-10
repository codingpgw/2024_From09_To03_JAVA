package com.pcwk.ehr.ed07;

public class J04Replace_All {

	public static void main(String[] args) {
		
		String str = "Hello";
		String newStr = str.replace(str, "dd");
		
		System.out.println(str);
		System.out.println(newStr);
		
		String str01 = "banana apple avocado";
		System.out.println(str01.replaceAll("a", "c"));
		
		String str02 = "I have 120 apple and 456 oranges";
		System.out.println(str02.replaceAll("\\d", ""));
		//replaceAll("[0-9]", ""); 도 가능

	}
}
