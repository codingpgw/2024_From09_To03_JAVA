package com.pcwk.ehr.ed01;

public class J03PersonMain {

	public static void modifyPerson(Person p) {
		p.name = "김씨";
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		
		person.name = "이씨";
		
		System.out.println("함수 호출 전 : "+person.name);
		
		modifyPerson(person);
		
		System.out.println("함수 호출 후 : "+person.name);
		
//		함수 호출 전 : 이씨
//		함수 호출 후 : 김씨
	}

}
