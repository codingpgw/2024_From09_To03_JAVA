package com.pcwk.ehr.ed04;

public class Circle extends Shape {
	
	Point center; // 원점(x,y)
	int r;//반지름

	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	public Circle() {
		this(new Point(0,0),10);
	}
	
	public void draw() {
		System.out.printf("[center = (%d, %d), r = %d, color = %s]\n"
				,center.x, center.y,r,color);
	}
	
}
