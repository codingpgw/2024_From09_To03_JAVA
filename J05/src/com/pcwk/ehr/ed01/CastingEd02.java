package com.pcwk.ehr.ed01;

public class CastingEd02 {

	public static void main(String[] args) {
		//명시적 형변환
		int iNumber = 13;
		byte bNumber = (byte) iNumber;
		
		//선택 : Shift + end
		System.out.printf("%d , %d%n",iNumber, bNumber);
		
		//오버플로우
		iNumber =130;
		bNumber = (byte)iNumber;
		//쓰레기 값 발생 : byte의 표현 범위 넘어감
		System.out.printf("%d , %d%n",iNumber, bNumber);
		
		//정수와 실수간 형변환
		double pi = 3.14;
		iNumber = (int)pi;
		
		System.out.printf("%d, %.2f%n",iNumber, pi);
	}

}
