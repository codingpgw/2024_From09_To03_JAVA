package com.pcwk.ehr.ed02;

import java.util.Scanner;

public class Ed05While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		System.out.print("정수를 입력하시오. > ");
		num = sc.nextInt();
		
		
		while(num > 0) {
			int extNum = num % 10;
			num /= 10;
			sum += extNum;
		}
		
		System.out.printf("입력된 각 자리수의 합 : %d %n",sum);	
		sc.close();
	}

}
