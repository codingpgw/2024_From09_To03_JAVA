/**
 * FloatEd01.java<br/>
 * gy<br/>
 * 2024. 9. 12.<br/>
 */
package com.pcwk.ehr.ed01;

/**
 * 
 */
public class FloatEd01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float fVar = 9.12345678901234567890f;
		float fVa2 = 9.12345678901234567890f;
		
		double dVar = 9.12345678901234567890;
		
		System.out.printf("         12345678901234567890 %n");
		//소숫점 이하 6째 자리까지 출력
		
		System.out.printf("fVar : %f%n", fVar);
		System.out.printf("fva2 : %21.21f%n", fVa2);
		System.out.println("======================");
		System.out.printf("dVar : %21.21f%n", dVar);
		
	}
}
