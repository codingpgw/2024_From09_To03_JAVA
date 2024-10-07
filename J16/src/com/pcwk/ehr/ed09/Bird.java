package com.pcwk.ehr.ed09;

public class Bird implements Animal {

	@Override
	public void sound() {
		System.out.println("짹짹?");

	}

	@Override
	public void move() {
		System.out.println("Bird : 날개로 날아갑니다.");

	}

}
