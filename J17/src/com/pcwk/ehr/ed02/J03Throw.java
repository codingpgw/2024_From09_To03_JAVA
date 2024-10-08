package com.pcwk.ehr.ed02;

public class J03Throw {

	public static void main(String[] args) {
		int age = 14;
		
		try {
			if(age < 15) {
				throw new IllegalArgumentException("15살 이하는 구매할 수 없습니다.");
			}
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.printf("나이는 %d세 입니다.%n",age);
	}

}
