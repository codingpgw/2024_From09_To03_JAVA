package com.pcwk.ehr.ed07;

public class J02StringSubString {

	public static void main(String[] args) {
		String str = "ABCDE";
		
		System.out.println(str.substring(2)); // CDE
		System.out.println(str.subSequence(1, 3)); // BC
	}
}
