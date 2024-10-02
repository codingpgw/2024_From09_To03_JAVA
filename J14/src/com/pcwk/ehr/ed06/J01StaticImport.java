/**
 * Package Name : com.pcwk.ehr.ed06
 * Class Name : J01StaticImport.java
 * Description : 
 * Modification information : 
 * --------------------------------
 * 
 *
 * 최초 생성일 : 2024-10-01
 *---------------------------------
 * author : gy
 * since : 2024.09.09
 * see : 
 * copyright (C) by PCWK All right reserved
 */
package com.pcwk.ehr.ed06;

import static java.lang.Math.abs;
import static java.lang.Math.PI;
/**
 * 
 */
public class J01StaticImport {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = -9;
		
		System.out.println(number);
		System.out.println(Math.abs(number));
		
		System.out.println("Math.PI -> "+Math.PI);
		System.out.println("==============static import==================");
		System.out.println("abs(number) -> "+abs(number));
		System.out.println("Math.PI -> "+PI);
		
	}

}

//-9
//9
//Math.PI -> 3.141592653589793
//==============static import==================
//abs(number) -> 9
//Math.PI -> 3.141592653589793

