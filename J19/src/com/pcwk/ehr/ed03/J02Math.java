package com.pcwk.ehr.ed03;

public class J02Math {
	
	public static double Tri(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
	}
	
	public static void main(String[] args) {
		System.out.println(Tri(1.0, 1.0, 2.0, 2.0));
		System.out.println(Math.sqrt(2));
	}

}
