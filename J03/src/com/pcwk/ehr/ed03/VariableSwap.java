package com.pcwk.ehr.ed03;

public class VariableSwap {
	
	/**
	 * 두 변수의 값을 교환
	 * @param args
	 */
	public static void main(String[] args) {
		int strawberry = 5;
		int milk = 10;
		
		System.out.println("교환전 : strawberry = "+strawberry + ", milk =" + milk);
		
		//임시 변수를 사용하며 값 교환
		int emptyCup = strawberry;
		strawberry = milk;
		milk = emptyCup;
		
		System.out.println("교환후 : strawberry = "+strawberry + ", milk =" + milk);
		
	}

}
