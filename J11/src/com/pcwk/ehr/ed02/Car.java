package com.pcwk.ehr.ed02;

public class Car {
	//인스턴스 변수
	String model;
	String color;
	int speed;
	
	//클래스 변수, static변수
	static int numberOfwheel;
	
	//생성자(메서드)
	public Car() {
		
	}
	
	public void printCarInfo() {
		//지역 변수
		String info = "Car model : "+model;
		System.out.println(info);
	}
	
	public void speedUp(int num) {
		speed += num;
	}
	
}
