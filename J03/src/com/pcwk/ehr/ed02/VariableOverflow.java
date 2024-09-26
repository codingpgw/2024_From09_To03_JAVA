package com.pcwk.ehr.ed02;

public class VariableOverflow {

	/**
	 * int의 범위:
	 * 32비트 → 4바이트 크기의 부호 있는 정수, 
	 * 범위 → -2,147,483,648 ~ 2,147,483,647
	 * @param args
	 */
	public static void main(String[] args) {
		int maxInt = 2_147_483_647;	
		
		System.out.println("maxInt = "+maxInt);
		
		maxInt = maxInt + 1;//오버플로우 발생
		System.out.println("maxInt(오버플로우) = "+maxInt);
		
		//최소값에 1을 빼기 : 언더플로우 발생
		
		int minInt = -2_147_483_648;
		
		System.out.println("minInt = "+minInt);
		int underflowValue = minInt - 1;
		
		System.out.println("underflowValue(언더플로우) = "+underflowValue);
		
	}

}
