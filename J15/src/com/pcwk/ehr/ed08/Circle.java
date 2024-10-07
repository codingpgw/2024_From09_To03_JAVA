package com.pcwk.ehr.ed08;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return radius*radius*Math.PI;
	}

	
}
