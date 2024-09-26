package com.pcwk.ehr.ed03;

import java.util.Scanner;

public class Ed01DoWhile {

	public static void main(String[] args) {
		//메세지를 입력 받고, 출력, q를 입력하면 프로그램 종료.
		Scanner sc = new Scanner(System.in);
		System.out.println("┌──────────────────────┐");
		System.out.println("│1.메시지를 입력하세요.       │");
		System.out.println("│2.q를 입력하면 프로그램 종료. │");
		System.out.println("└──────────────────────┘");
		
		String inputMessage = "";
		
		do {
			System.out.print("메세지를 입력하세요. > ");
			inputMessage = sc.nextLine();
			System.out.printf("입력 메시지 : %s%n",inputMessage);
			
		}while(!inputMessage.equals("q"));
		System.out.println();
		System.out.println("프로그램 종료");
		
		sc.close();
	}

}
