package com.pcwk.ehr.ed04;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(new Point(100,100),50);
		circle.color = "red";
		circle.draw();
		
		Point[] pointArr = {
				new Point(100,100),
				new Point(140, 140),
				new Point(200, 100)
		};
		
		Triangle triangle = new Triangle(pointArr);
		triangle.draw();
	}

}
//[center = (100, 100), r = 50, color = red]
//[p1 = (100,100), p2 = (140,140), p3 = (200,100), color = Black]