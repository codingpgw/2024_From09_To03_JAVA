package com.pcwk.ehr.ed08;

public class Rectangle extends Shape {
	double width;
	double height;
	
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}
	
}
