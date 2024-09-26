package com.pcwk.ehr.ed01;

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
		
	}

}
