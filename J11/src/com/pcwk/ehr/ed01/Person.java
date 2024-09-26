package com.pcwk.ehr.ed01;

public class Person {
	public String name;
	public int age;
	
	public void sayHello() {
		System.out.println("안녕하세요. 저는"+name+"이고, "+age+"살 입니다.");
		
		return;//반환 타입이 void인 경우 return문 생략
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;//반환 타입이 void가 아닌 경우 생략 불가
	}
	public static int max(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	
	//This method must return a result of type int
	}
	
	
}
