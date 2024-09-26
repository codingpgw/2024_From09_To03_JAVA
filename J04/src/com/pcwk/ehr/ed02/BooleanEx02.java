/**
 * BooleanEx02.java<br/>
 * gy<br/>
 * 2024. 9. 12.<br/>
 */
package com.pcwk.ehr.ed02;

/**
 * 
 */
public class BooleanEx02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 18;
		
		boolean result = (x == 20);
		System.out.printf("(x == 20) : %b%n", result);
		
		result = (x != 20);
		System.out.printf("(x != 20) : %b%n", result);
		
		result = (x > 20);
		System.out.printf("(x > 20) : %b \n", result);

	}

}
