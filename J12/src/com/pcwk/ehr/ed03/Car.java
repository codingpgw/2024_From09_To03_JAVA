package com.pcwk.ehr.ed03;

public class Car {
	
	String model;
	String color;
	int year;
	
	Car(){
		model = "미정";
		color = "White";
		year = 2024;
	}
	
	Car(String model, String color, int year){
		this.model = model; //this.멤버 = model(파라메터)
		this.color = color;
		this.year = year;
	}
	
	void displayInfo() {
		System.out.printf("Model : %s\nColor : %s\n년식 : %d\n",model,color,year);
	}
	
}
