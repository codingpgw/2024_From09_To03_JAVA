/**
 * 파일명 : PrintfString.java<br/>
 * 작성자 : acorn4<br/>
 * 작성일 : 2024-09-11<br/>
 */
package com.pcwk.ehr.ed06;

/**
 * 
 */
public class PrintfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 10;
		double pi = 3.141_592;
		String name = "James";
		
		System.out.printf("정수 : %d,부동 소수점 숫자 : %.2f %n"
				+ "문자열 : %s %n", num, pi, name);
		
		//문자
		char grade = 'A';
		System.out.printf("성적 : %c %n", grade);
		
		//10진수 -> 16진수
		int hexValue = 255;
		System.out.printf("255(10진수 -> 16진수) : %x\n", hexValue);
		
		//자리수 확인:
		
		//정수 출력(패딩) : 5개 자리를 확보하고, 빈 자리는 0으로 채움
		System.out.printf("패딩된 정수 : %05d %n", 23);
		
		//문자열 좌측정렬(-자리수)
		String fruit = "apple";
		
		float price = 200.5f;
		
		System.out.printf("좌측정렬 : %-10s, 가격 : %6.2f %n", fruit, price);
		
	}

}
