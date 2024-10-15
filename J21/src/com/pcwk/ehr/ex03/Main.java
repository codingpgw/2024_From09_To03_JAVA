package com.pcwk.ehr.ex03;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.pcwk.ehr.cmn.PLog;

public class Main implements PLog{

	public static void main(String[] args) {
		long start = System.nanoTime();
		int[] scores = new int[1000];
		for(int i=0; i<scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		double avg = (double)sum / scores.length;
		System.out.println(avg);
		long end = System.nanoTime();
		System.out.println(end-start+"나노초");
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		System.out.println(sdf.format(cal.getTime()));
	}
	

}
