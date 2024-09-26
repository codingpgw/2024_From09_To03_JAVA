package com.pcwk.ehr.ed01;

import java.util.Scanner;

public class Ed02Switch {

	public static void main(String[] args) {
		//성적(score)입력 받아 학점 출력
		int score = 0; // 성적
		char grade = ' '; // 학점
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하세요. > ");
		score = sc.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}//switch end-----------------------------------------------

		System.out.printf("당신의 성적은 %d점 이므로 %c 학점입니다. \n",score,grade);
		sc.close();
	}//main end----------------------------------------------------

}
