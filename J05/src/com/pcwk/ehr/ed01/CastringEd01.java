package com.pcwk.ehr.ed01;

public class CastringEd01 {

	public static void main(String[] args) {
		//묵시적 형변환(자동 형변환)
		byte bNumber = 13;
		int  iNumber = 15;
		
		//Type mismatch: cannot convert from int to byte
		//byte result = bNumber + iNumber;
		int result = bNumber + iNumber;
		
		System.out.printf("%d + %d = %d %n", bNumber, iNumber, result);
		
		//정수와 실수간 연산
		iNumber = 17;
		float fNumber = 22.0f;
		//Type mismatch: cannot convert from float to int
		//	int + float -> float + float
		float result02 = iNumber + fNumber;
		
		System.out.printf("%d + %f = %f %n",iNumber, fNumber, result02);
		
		System.out.println("-----------------------------------------------");
		byte aAge = 13;
		byte bAge = 15;
		
		//byte가 int로 변환되어 연산이 된다.
		//byte result3 = aAge + bAge;
		int result3 = aAge + bAge;
		
		int v1 = 1;
		
	}

}
