package com.pcwk.ehr.ed05;

import java.util.Scanner;

public class ComparisonOp6 {
	//Scanner 클래스를 통해 콘솔에 데이터를 입력 받아, 입력받은 char문자, 숫자를 확인
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나를 입력 하세요 >");
		String inChar = sc.nextLine();
		System.out.printf("inChar = %s%n", inChar);
		
		//여러문자 중 첫 번째 char 추출
		char ch = inChar.charAt(0);
		System.out.printf("ch = %c %n",ch);
		
		//숫자 여부 판단
		if(('0' <= ch && ch <= '9')) {
			System.out.println("입력한 문자는 숫자 입니다.");
		}
		
		//영문자 여부 판단
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("입력한 문자는 영문자입니다.");
		}
		
	}
	

}
