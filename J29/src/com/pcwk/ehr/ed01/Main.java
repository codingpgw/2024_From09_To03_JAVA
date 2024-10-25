package com.pcwk.ehr.ed01;

public class Main {

	public static void main(String[] args) {
		Day today = Day.FRIDAY;
		
		if(today  == Day.FRIDAY) {
			System.out.println("오늘은 금요일입니다.");
		}
		
		//모든 열거형 값 순회
		for(Day day : Day.values()) {
			System.out.println(day);
		}

	}

}
