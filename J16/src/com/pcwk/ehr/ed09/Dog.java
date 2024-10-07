package com.pcwk.ehr.ed09;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	@Override
	public void move() {
		System.out.println("Dog : 네 발로 달립니다.");

	}

}
