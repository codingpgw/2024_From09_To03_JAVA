package com.pcwk.ehr.ed05;

public class CustomClass {
	String name;
	int age;
	
	static int serialNo;
	
	{
		name = "코크베어";
		age = 38;
	}
	
	static {
		serialNo++;
	}
	
	public CustomClass() {
		this("곽철득",1); //생성자에서 또 다른 생성자 호출
	}
	
	//생성자 생성 : alt + shift + s
	public CustomClass(String name, int age) {
		//
		this.name = name;
		this.age = age;
	}
	
	//인스턴스 메서드 : 인스턴스 변수에 영향을 받는 메서드
	public void displayInfo() {
		
	}
	
	//인스턴스 메서드 : 신규 메서드
	public void displayInfo(int newAge) {
		
	}
	
	public void displayInfo(int newAge, int... numbers) {
		
	}
	
	//클래스 메서드 : 인스턴스 변수에 영향을 받지 않는 메서드
	public static void displayStaticInfo() {
		
	}
	
}
