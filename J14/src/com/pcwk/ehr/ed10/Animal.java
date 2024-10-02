package com.pcwk.ehr.ed10;

public abstract class Animal {
	
	
	 //추상 메서드: 하위에서 구현 필요
	abstract void sound();
	
	//일반 메서드
	void eat() {
		System.out.println("동물이 밥을 먹습니다.");
	}
}
