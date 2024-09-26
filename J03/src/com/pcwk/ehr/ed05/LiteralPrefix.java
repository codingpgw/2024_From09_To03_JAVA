/**
 * 파일명 : LiteralPrefix.java<br/>
 * 작성자 : acorn4<br/>
 * 작성일 : 2024-09-11<br/>
 * -------------------------------------------
 * 
 */
package com.pcwk.ehr.ed05;

/**
 * 
 */
public class LiteralPrefix {
	/****
	 * 정수형 리터럴 표기법:
	 *	- 10진수 : 23
	 *	- 2진수 : 접두사 0b를 사용해 2진수 리터럴을 나타냄 → 예 : 0b1101(13)
	 *	- 8진수 : 접두사 0을 사용해 8진수 리터럴을 나타냄 → 예 : 012(10)
	 *	- 16진수 : 접두사 0x을 사용해 16진수 리터럴을 나타냄 → 예 : 0x1A(26) 
	 *	→ 유니코드는 \uAC00→ 가
	 *
	 * @param args
	 */
	
	public static void main(String[] args) {
		int octNum = 010;  // 8진수  10 -> 8
		int hexNum = 0x10; // 16진수 10 -> 16
		int binNum = 0b10; // 2진수  10 -> 2
		//각 진수를 10진수로 출력
		
		System.out.println("010 : "+octNum);
		System.out.println("0x10 : "+hexNum);
		System.out.println("0b10 : "+binNum);
	}

}
