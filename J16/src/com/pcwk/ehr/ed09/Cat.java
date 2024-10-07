package com.pcwk.ehr.ed09;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("야옹");

	}

	@Override
	public void move() {
		System.out.println("Cat : 부드럽게 걷습니다.");

	}

}
