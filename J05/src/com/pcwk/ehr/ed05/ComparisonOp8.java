package com.pcwk.ehr.ed05;

public class ComparisonOp8 {
	
	public static void main(String[] args) {
		//-! : 피연산자가 true면 false, false이면 true로 결과를 반환한다.
		boolean bValue = true;
		

		System.out.printf("bValue = %b%n", bValue);
		
		System.out.printf("bValue = %b%n", !bValue);
		System.out.printf("bValue = %b%n", !!bValue);
	
		System.out.println("==============================================");
		
		
		char ch = 'C';
		System.out.printf("ch = %c%n",ch);
		
		System.out.println(ch < 'a' || ch > 'z');
		//!(ch < 'a' || ch > 'z') => (ch >= 'a' && ch <= 'z')
		System.out.println(!(ch < 'a' || ch > 'z'));
		System.out.println((ch >= 'a' && ch <= 'z'));
	}
	

}
