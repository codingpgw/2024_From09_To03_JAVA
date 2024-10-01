package com.pcwk.ehr.ed03;

public class Dog extends Animal {
	int age = 2;
	public Dog() {
		System.out.println("Dog 생성자");
	}

	@Override
	public void sound() {
		System.out.println("강아지가 짖습니다.");
		System.out.println("age : "+age);
		
		//this : Dog age
		System.out.println("this.age : "+this.age);
		//super : Animal age
		System.out.println("super.age : "+super.age);
		//부모 메서드 호출
		super.sound();
	}
	
}
