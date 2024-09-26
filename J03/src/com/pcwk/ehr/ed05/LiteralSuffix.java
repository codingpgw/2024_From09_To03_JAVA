/**
 * 파일명 : LiteralSuffix.java<br/>
 * 작성자 : acorn4<br/>
 * 작성일 : 2024-09-11<br/>
 */
package com.pcwk.ehr.ed05;

/**
 * 
 */
public class LiteralSuffix {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//debug실행 : F11
		//Type mismatch: cannot convert from long to int
		//int myAge = 23L; -> 정수형 default int
		
		long myAge = 23L;
		
		//실수형 default double
		//Type mismatch: cannot convert from double to float
		//float newAge = 23.5;
		float newAge = 23.5f;
		double rate = 22.8d;
		System.out.println("myAge = "+myAge);
		System.out.println("newAge = "+newAge);
		System.out.println("rate = " +rate);
		
		
	}   
	
}          
