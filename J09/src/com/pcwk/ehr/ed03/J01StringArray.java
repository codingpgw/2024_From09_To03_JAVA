package com.pcwk.ehr.ed03;

public class J01StringArray {

	public static void main(String[] args) {
		String[] fruits = {"Apple","Banana","Grape"};
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		String tmp = fruits[0];
		System.out.println("tmp: "+tmp);
		fruits[0] = "Google";
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}

	}

}
