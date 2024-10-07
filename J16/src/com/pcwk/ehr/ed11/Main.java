package com.pcwk.ehr.ed11;

public class Main {

	public static void main(String[] args) {
		//정적 이너 클래스의 객체 생성
		Outer.StaticInner inner = new Outer.StaticInner();
		
		inner.display();
	}

}
