package com.pcwk.ehr.ed11;

public class Outer {
	
	static String staticField = "정적 필드";
	String name = "인스턴스 필드";
	
	//정적 이너 클래스
	static class StaticInner{
		
		void display() {
			System.out.println(staticField);
		}
	}
	
}
