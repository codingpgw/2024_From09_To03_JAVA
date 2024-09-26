package com.pcwk.ehr.ed03;

import java.util.Scanner;

public class J08Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("궁금하신 년/월을 입력해주세요. > ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || 
				month == 8 || month == 10 || month ==12) {
			System.out.printf("%d년의 %d월은 31일까지 있습니다.\n",year,month);
			
		}else if(month == 2) {
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.printf("%d년의 %d월은 29일까지 있습니다.\n",year,month);
			}else {
				System.out.printf("%d년의 %d월은 28일까지 있습니다.\n",year,month);
			}
		}else if(month == 4 || month == 6 || month == 9 || month == 11){
			System.out.printf("%d년의 %d월은 30일까지 있습니다.\n",year,month);
		}else {
			System.out.println("잘못된 월을 입력하셨습니다.");
		}
		
		sc.close();
	}

}
