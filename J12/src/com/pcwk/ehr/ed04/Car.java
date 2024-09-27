package com.pcwk.ehr.ed04;

public class Car {
	String model;
	String color;
	int year;
	
	public Car(String model, String color, int year){
		this.model = model;
		this.color = color;
		this.year = year;
		System.out.println("모든 매개변수가 있는 생성자");
	}

	public Car(String model) {
		this(model, "white", 2002);
		System.out.println("매개변수가 1개 있는 생성자");
	}

	public Car() {
		this("Tesla","white",2024);
		System.out.println("매개변수 없는 생성자");
	}
	public void displayInfo() {
		System.out.printf("모델 : %s, 색상 : %s,  년식 : %d%n",model,color,year);
	}
	
}
