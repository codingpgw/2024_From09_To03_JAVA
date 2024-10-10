package com.pcwk.ehr.ed07;

public class J03EqualsTrim {

	public static void main(String[] args) {
		String str1 = "happy    ";
		String str2 = "happy";
		
		System.out.println(str1.equals(str2)); // false
		System.out.println(str1.trim().equals(str2)); // true
		System.out.println(str1.trim() == str2); // false

	}

}
