package com.pcwk.ehr.ed04;

public class Point {
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point() {
		this(0,0);
	}
	
	public String getXY() {
		return "("+x+","+y+")";
	}
	
	
}
