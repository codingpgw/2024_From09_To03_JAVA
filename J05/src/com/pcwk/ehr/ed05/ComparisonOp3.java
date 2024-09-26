package com.pcwk.ehr.ed05;

public class ComparisonOp3 {

	public static void main(String[] args) {
		
		//실수형은 2진수 근사값으로 저장
		
		float fValue = 0.1f;
		double dValue = 0.1;
		
		System.out.println(10 == 10.0f);//true
		System.out.printf("0.1f == 0.1 \t %b%n",(fValue == dValue));
		
		System.out.println("=========================================");
		System.out.printf("fValue = %19.17f %n",fValue);
		System.out.printf("fValue = %19.17f %n",dValue);
		

		
		
	}

}
