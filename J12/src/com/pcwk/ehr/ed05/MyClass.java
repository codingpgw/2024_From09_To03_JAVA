package com.pcwk.ehr.ed05;

public class MyClass {
	//인스턴스 변수
	int x;
	int y;
	
	//인스턴스 초기화 블럭
	{
		x = 13;
		y = 15;
		System.out.println("인스턴스 초기화 블럭");
	}
	
	public MyClass() {
		System.out.println("생성자 실행!");
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		MyClass myClass2 = new MyClass();
	}
}
//인스턴스 초기화 블럭
//생성자 실행!
//인스턴스 초기화 블럭
//생성자 실행!
