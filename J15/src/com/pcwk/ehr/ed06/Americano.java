package com.pcwk.ehr.ed06;

public class Americano extends Coffee {
	
	public Americano() {
		//조상 클래스의 생성자 호출
		super(4500);
	}
	
	@Override
	public String getName() {
		return "Americano";
	}
}
