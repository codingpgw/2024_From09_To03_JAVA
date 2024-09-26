package com.pcwk.ehr.ed03;

import java.util.Scanner;

public class J06Ex07 {

	public static void main(String[] args) {
		//입력 버퍼 문제: nextInt() 사용 후 nextLine()을 사용할 때 
		//발생할 수 있는 입력 버퍼 문제가 있습니다.
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int bankbook = 0;
		
		while(true) {
			String select = "";
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택 > ");
			select = sc.nextLine();
			
			if(select.equals("1")) {
				
				System.out.print("예금액 > ");
				input = Integer.parseInt(sc.nextLine());
				bankbook += input;
				continue;
			}else if(select.equals("2")) {
				System.out.print("출금액 > ");
				input = Integer.parseInt(sc.nextLine());;
				bankbook -= input;
				continue;
			}else if(select.equals("3")) {
				System.out.printf("잔고 > %d%n",bankbook);
				continue;
			}else if(select.equals("4")){
				System.out.println("프로그램 종료\n");
				break;
			}
			
			
		}
		sc.close();
	}

}
