package com.pcwk.ehr.ed01;

public class J02ForFloat {

	public static void main(String[] args) {
		//부동 소수점 방식은 2진수로 변환시 소실이 발생
		//10회 반복이 예상 하지만 9회 수행
		for(float i= 0.1f; i<=1.0f; i+= 0.1f) {
			System.out.println(i);
		}

	}

}
