package com.pcwk.ehr.ed06;

public class CaffeMocha extends Coffee {
	
	public CaffeMocha() {
		//조상 클래스의 생성자 호출
		super(6000);
	}
	
	@Override
	public String getName() {
		return "CaffeMocha";
	}
}
