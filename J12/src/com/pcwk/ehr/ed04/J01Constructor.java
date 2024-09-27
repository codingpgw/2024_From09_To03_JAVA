package com.pcwk.ehr.ed04;

public class J01Constructor {

	public static void main(String[] args) {
		Car car01 = new Car();
		car01.displayInfo();
		
		System.out.println("=================================");
			
		
		Car car02 = new Car("sonata");
		car02.displayInfo();

		System.out.println("=================================");
		Car car03 = new Car("BMW", "Black",2022);
		car03.displayInfo();
	}

}
//모든 매개변수가 있는 생성자
//매개변수 없는 생성자
//모델 : Tesla, 색상 : white,  년식 : 2024
//=================================
//모든 매개변수가 있는 생성자
//매개변수가 1개 있는 생성자
//모델 : sonata, 색상 : white,  년식 : 2002
//=================================
//모든 매개변수가 있는 생성자
//모델 : BMW, 색상 : Black,  년식 : 2022
