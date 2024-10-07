package com.pcwk.ehr.ed10;

public class Outer {
	private String outerField = "외부 클래스 인스턴스 변수";
	
	class InnerClass{
		void display() {
			System.out.println("외부 클래스 인스턴스 변수 : "+outerField);
		}
	}
	
}
