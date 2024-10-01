package com.pcwk.ehr.ed04;

public class Triangle extends Shape {
	
	Point[] pointArr = new Point[3];
	
	

	public Triangle(Point[] pointArr) {
		this.pointArr = pointArr;
	}

	public Triangle() {

	}
	
	public void draw() {
		System.out.printf("[p1 = %s, p2 = %s, p3 = %s, color = %s]\n"
				,pointArr[0].getXY()
				,pointArr[1].getXY()
				,pointArr[2].getXY()
				,color);
	}
	
}
