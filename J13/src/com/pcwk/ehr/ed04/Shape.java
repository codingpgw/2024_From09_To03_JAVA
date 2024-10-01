package com.pcwk.ehr.ed04;

public class Shape {
	String color;

	public Shape() {
		color = "Black";
	}
	
	public void draw() {
		System.out.println("도형을 "+color+"색으로 그립니다.");
	}
	
}
