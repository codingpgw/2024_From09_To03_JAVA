package com.pcwk.ehr.ed01;

public class NoneHandleException {

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("B");
		System.out.println(21/0);
		System.out.println("C");
		
		System.out.println("┌───────────────────┐");
		System.out.println("│     프로그램 종료     │");
		System.out.println("└───────────────────┘");

	}

}
