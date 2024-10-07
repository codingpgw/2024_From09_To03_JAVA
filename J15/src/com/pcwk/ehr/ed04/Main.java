package com.pcwk.ehr.ed04;

public class Main {
	//부모 자식 간에는 형변환 가능, 형제 자매 간에는 형변환 불가
	public static void main(String[] args) {
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
		System.out.println(myDog instanceof Animal);//true
		System.out.println(myDog instanceof Dog);//true
		System.out.println(myDog instanceof Cat);//false
		System.out.println(myDog instanceof Object);//true
	}
}	
