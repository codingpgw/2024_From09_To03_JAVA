package com.pcwk.ehr.ed03;

public class Car {
	Engine engine;
	
	public Car(String enginType) {
		engine = new Engine(enginType);//Engine 생성
	}
	
	public void startCar() {
		engine.start();//엔진을 사용하여 자동차 시동
		System.out.println("자동차가 움직입니다.");
	}
	public void stopCar() {
		engine.stop();
		System.out.println("자동차가 멈췄습니다.");
	}
	
}
