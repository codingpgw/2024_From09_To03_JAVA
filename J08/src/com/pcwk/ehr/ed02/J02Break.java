package com.pcwk.ehr.ed02;

public class J02Break {

	public static void main(String[] args) {
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch+",");
			for(char ich='1'; ich<='9'; ich++) {
				System.out.print(ich+",");
				if(ich == '5') {
					break;
				}
			}
			System.out.println();
		}
	}

}
