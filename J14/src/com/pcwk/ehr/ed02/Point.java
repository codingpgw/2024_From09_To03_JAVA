package com.pcwk.ehr.ed02;

public class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public String getLocation() {
		return "x : "+x+", y : "+y;
	}
}
