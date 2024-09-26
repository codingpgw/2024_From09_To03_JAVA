package com.pcwk.ehr.ed02;

import java.util.Scanner;

public class IfElseIfElseEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		double sum = 0;
		System.out.print("성적을 입력하실 과목의 개수를 작성해주십시오. > ");
		int subjectTotal = sc.nextInt();

		int[] subject = new int[subjectTotal];
		char plus = ' ';
		for (int i = 0; i < subjectTotal; i++) {
			System.out.printf("제 %d 과목 성적을 입력하세요 >   ", i + 1);
			score = sc.nextInt();

			subject[i] = score;
		}

		char[] grades = new char[subjectTotal];
		double[] totalGrades = new double[subjectTotal];
		
		for (int j = 0; j < subjectTotal; j++) {
			plus = ' ';
			if (subject[j] >= 60 && subject[j] % 10 >= 5) {
				plus = '+';
			}
			if (subject[j] >= 90) {
				grades[j] = 'A';
			} else if (subject[j] >= 80) {
				grades[j] = 'B';
			} else if (subject[j] >= 70) {
				grades[j] = 'C';
			} else if (subject[j] >= 60) {
				grades[j] = 'D';
			} else {
				grades[j] = 'F';
			}

			if (grades[j] == 'A') {
				totalGrades[j] = 4.0;
			} else if (grades[j] == 'B') {
				totalGrades[j] = 3.0;
			} else if (grades[j] == 'C') {
				totalGrades[j] = 2.0;
			} else if (grades[j] == 'D') {
				totalGrades[j] = 1.0;
			} else {
				totalGrades[j] = 0.0;
			}

			if (plus == '+') {
				totalGrades[j] += 0.5;
			}

			sum += totalGrades[j];
		}


		double avg = sum / subjectTotal;
		System.out.printf("당신의 총 학점은 %.1f이며, 이번 학기 학점은 %.1f입니다.%n", sum, avg);

//		char grade = ' ';

//		if(score >= 90) {
//			grade = 'A';
//		}else if(score >= 80) {
//			grade = 'B';
//		}else if(score >= 70) {
//			grade = 'C';
//		}else if(score >= 60) {
//			grade = 'D';
//		}else {
//			grade = 'F';
//		}

//		if(score >= 60 && score % 10 >= 5) {
//			plus = '+';
//			System.out.printf("당신의 성적은 %d점 이므로 %c%c 학점입니다. \n",score,grade,plus);
//		}else {
//		
//			System.out.printf("당신의 성적은 %d점 이므로 %c 학점입니다. \n",score,grade);
//		}
		// scanner 메모리 반납
		sc.close();
	}

}
