package com.pcwk.ehr.ed01;

public class J04NestedFor {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
	
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
