package com.pcwk.ehr.ed08;

public abstract class Shape {
	//추상 메서드
	public abstract double calculateArea();
	
	public void printArea() {
		System.out.println("면적 : "+calculateArea());
	}
}
