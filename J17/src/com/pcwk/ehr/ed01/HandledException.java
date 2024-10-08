package com.pcwk.ehr.ed01;

public class HandledException {

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("B");
		try {
			System.out.println("B1");
			System.out.println(21/0);
			System.out.println("C");//예외 발생시 수행 하지 않음			
		}catch(ArithmeticException e) {
			System.out.println("D");
		}
		
		System.out.println("┌───────────────────┐");
		System.out.println("│     프로그램 종료     │");
		System.out.println("└───────────────────┘");

	}

}
