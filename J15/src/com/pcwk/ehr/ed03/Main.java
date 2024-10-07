package com.pcwk.ehr.ed03;

public class Main {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		Ambulance am = new Ambulance();
		
		Car car = fe;//Car 타입으로 형변환(업캐스팅)
		car.drive();
		System.out.println("======================");
		FireEngine fe02 = (FireEngine) car;//다운캐스팅
		fe02.drive();
		fe02.water();
		System.out.println("======================");
		Car car02 = am;
		car02.drive();//Car메서드 호출 가능
		System.out.println("======================");
		
		//Type mismatch: cannot convert from Ambulance to FireEngine
		//형제, 자매 간에는 형변환 불가
		//FireEngine fe03 = am;
		//instanceof : 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 사용

		//다른 자식 클래스인 Ambulance로 변환 시도(잘못된 캐스팅)
		if(car instanceof Ambulance) {
			Ambulance amb = (Ambulance) car;
			amb.drive();			
		}
	}
}
//차가 달립니다.
//======================
//차가 달립니다.
//소방차가 물을 뿌립니다.
//======================
//차가 달립니다.
//======================
