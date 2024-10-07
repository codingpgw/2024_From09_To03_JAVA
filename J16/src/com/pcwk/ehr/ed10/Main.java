package com.pcwk.ehr.ed10;

public class Main {

	public static void main(String[] args) {
		//외부 클래스 생성
		Outer outer = new Outer();
		
		//인스턴스 이너 클래스
		Outer.InnerClass inner = outer.new InnerClass();
		
		//이너 클래스 메서드 호출
		inner.display();

	}

}
