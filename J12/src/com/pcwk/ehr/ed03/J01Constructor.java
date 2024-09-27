package com.pcwk.ehr.ed03;

public class J01Constructor {

	public static void main(String[] args) {
		
		//기본생성자 호출
		Car car01 = new Car();
		car01.displayInfo();
		System.out.println("========================");
		//매개변수가 있는 생성자로 객체 생성
		Car car02 = new Car("무르시엘라고", "gold", 2024);
	
		car02.displayInfo();

	}

}
//Model : 미정
//Color : White
//년식 : 2024
//========================
//Model : 무르시엘라고
//Color : gold
//년식 : 2024