package com.pcwk.ehr.ed01;

public class PersonMain {

	public static void main(String[] args) {
		//Person 클래스의 객체 생성
		Person person01 = new Person();
		Person person02 = new Person();
		
		//객체의 멤버 변수 설정
		person01.name = "한씨";
		person01.age = 54;
		person02.name = "김씨";
		person02.age = 62;
		
		//객체의 메서드 호출
		person01.sayHello();
		person02.sayHello();

	}

}
