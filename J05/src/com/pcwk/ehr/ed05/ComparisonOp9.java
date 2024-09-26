package com.pcwk.ehr.ed05;

public class ComparisonOp9 {

	public static void main(String[] args) {
		//나이에 따라 출입 여부 판단!
		int age = 22;
		
		String message = (age >= 19)?"성인":"미성년";
		
		System.out.printf("나이 = %d%n성인 여부 : %s%n",age, message );
	}

}
