package com.pcwk.ehr.ed01;

public class Dog extends Animal {
	String breed;

	public Dog() {

	}
	
	public void bark() {
		System.out.println(breed+"가 짖습니다.");
	}
}
