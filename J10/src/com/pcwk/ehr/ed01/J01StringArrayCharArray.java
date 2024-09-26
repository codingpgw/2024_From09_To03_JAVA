package com.pcwk.ehr.ed01;

public class J01StringArrayCharArray {

	public static void main(String[] args) {
		char[] hex = { 'C', 'A', 'F', 'E', '2' };
		String[] binary = { "0000", "0001", "0010", "0011", "0100", 
				"0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };
		
		String result = "";
		for (int i = 0; i < hex.length; i++) {
			if(hex[i] >= '0' && hex[i] <= '9') {
//				System.out.println(hex[i]-'0');
				int index = hex[i] - '0';
				result += binary[index];
			}else {
//				System.out.println(hex[i] - 'A' +10);
				int index = hex[i] - 'A' + 10;
				result += binary[index];
			}
			
		}
		System.out.println("16진수 : "+ new String(hex));
		System.out.println("2진수 : "+result);
		

	}

}

//16진수 : CAFE2
//2진수 : 11001010111111100010