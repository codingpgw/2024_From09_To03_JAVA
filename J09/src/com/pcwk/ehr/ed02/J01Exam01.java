package com.pcwk.ehr.ed02;

public class J01Exam01 {

	public static void main(String[] args) {
		int[] studentScore = {79, 55, 88, 100, 77};
		int sum = 0;
		for(int studentScores : studentScore) {
			sum += studentScores;
		}
		double avg = sum / (studentScore.length * 1.0);
		System.out.printf("총점 : %d, 평균 : %.2f %n",sum,avg);

	}

}
