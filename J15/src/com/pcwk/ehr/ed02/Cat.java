package com.pcwk.ehr.ed02;

public class Cat extends Animal {

	public Cat() {
		System.out.println("Cat() 생성자");
	}

	@Override
	public void sound() {
		System.out.println("고양이가 야옹하고 웁니다.");
	}
	
}
