package com.pcwk.ehr.ed03;

public class Main {

	public static void main(String[] args) {
		//Car 생성(포함된 엔진 지정)
		Car car = new Car("V8");
		car.startCar();
		car.stopCar();
	}
}
//V8엔진이 작동합니다.
//자동차가 움직입니다.
//V8엔진이 멈췄습니다.
//자동차가 멈췄습니다.