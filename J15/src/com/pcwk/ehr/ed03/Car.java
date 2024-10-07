package com.pcwk.ehr.ed03;

public class Car {
	private String color;
	private int door;
	
	public Car() {
		this("white",4);
	}

	public Car(String color, int door) {
		this.color = color;
		this.door = door;
	}

	//setter, getter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}
	
	
	public void drive() {
		System.out.println("차가 달립니다.");
	}
	public void stop(){
		System.out.println("차가 멈춥니다.");
	}
}
