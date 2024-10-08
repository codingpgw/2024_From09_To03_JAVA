package com.pcwk.ehr.ed02;

public class J02UncheckedException {

	public static void main(String[] args) {
		int[] numbers = {13,15,18};
		
		int index = 5;
		try {
			int result = numbers[index];
			System.out.println("result : "+result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException : "+e.getMessage());
		}
		
		System.out.println("프로그램 종료");
	}

}
