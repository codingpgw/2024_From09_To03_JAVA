package com.pcwk.ehr.ed02;

public class J03Break {

	public static void main(String[] args) {
		
		Out:for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch+",");
			for(char ich='1'; ich<='9'; ich++) {
				System.out.print(ich+",");
				if(ich == '5') {
					break Out;
				}
			}
			System.out.println();
		}
	}

}
