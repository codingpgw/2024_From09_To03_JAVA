package com.pcwk.ehr.ed01;

import java.util.Scanner;

public class Ed03Switch {

	public static void main(String[] args) {
		// 월을 입력 받아 분기를 출력하는 프로그램
		// ex) 1, 2, 3 -> 1/4분기
		Scanner sc = new Scanner(System.in);
		String quarter = "";
		int month = 0;
		
		//내가 사용한 클래스를 import에 표시 : ctrl+shift+o
		System.out.print("몇 월인지 입력해주세요. > ");
		month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 2:
		case 3:
			quarter = "1/4분기";
			break;
		case 4:
		case 5:
		case 6:
			quarter = "2/4분기";
			break;
		case 7:
		case 8:
		case 9:
			quarter = "3/4분기";
			break;
		case 10:
		case 11:
		case 12:
			quarter = "4/4분기";
			break;
		default:
			quarter = "1~12월에 포함되지 않는 월";
			break;
		
		}//switch end---------------------------------------------------
		System.out.printf("%d월 이므로 %s입니다.%n",month, quarter);
		
		sc.close();
	}

}
