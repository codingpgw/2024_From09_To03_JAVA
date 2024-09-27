package com.pcwk.ehr.ed01;

public class J06Overloading {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		System.out.println(mm.add(13, 15));
		
		System.out.println(mm.add(15, 18L));
		
		System.out.println(mm.add(13L, 18));
	}

}
