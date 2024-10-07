package com.pcwk.ehr.ed02;

public class Dog extends Animal {

	public Dog() {
		//super();
		System.out.println("Dog() 생성자");
	}

	@Override
	public void sound() {
		System.out.println("강아지가 멍멍 짖습니다.");
	}
	
}
