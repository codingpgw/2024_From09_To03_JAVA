package com.pcwk.ehr.ed03;

public class Ambulance extends Car {

	public Ambulance() {
		super();
	}

	public Ambulance(String color, int door) {
		super(color, door);
	}
	
	public void rescue() {
		System.out.println("구급차가 사람을 구합니다.");
	}
	
}
