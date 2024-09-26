package com.pcwk.ehr.ed01;

public class J02StringMorse {

	public static void main(String[] args) {
		String message = "SOSHELP";

		String[] morse = { "・-", "-・・・", "-・-・", "－・・", "・", "・・－・", "－－・"
				, "・・・・", "・・", "・－－－", "－・－", "・－・・", "－－",
				"－・", "－－－", "・－－・", "－－・－", "・－・", "・・・", "－", 
				"・・－", "・・・－", "・－－", "－・・－", "－・－－", "－－・・" };
		
		String result = ""; //모스부호
		
		for(int i = 0; i<message.length(); i++) {
//			System.out.print(message.charAt(i));
			int index = message.charAt(i) - 'A';
//			System.out.println(":" +index);
			result += morse[index] + " ";
		}
		System.out.println("message:"+message);
		System.out.println("morse : "+result);
		
	}

}
//결과값
//message:SOSHELP
//morse : ・・・ －－－ ・・・ ・・・・ ・ ・－・・ ・－－・ 

