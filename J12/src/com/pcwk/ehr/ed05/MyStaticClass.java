package com.pcwk.ehr.ed05;

public class MyStaticClass {
	static int staticNum;
	
	//정적 초기화 블럭
	static {
		staticNum = 18;
		System.out.println("정적 초기화 블럭");
	}
	
	public MyStaticClass() {
		System.out.println("생성자 실행");
	}

	public static void main(String[] args) {
		System.out.println(staticNum);
		MyStaticClass obj01 = new MyStaticClass();
		MyStaticClass obj02 = new MyStaticClass();

	}
}
//정적 초기화 블럭
//18
//생성자 실행
//생성자 실행

