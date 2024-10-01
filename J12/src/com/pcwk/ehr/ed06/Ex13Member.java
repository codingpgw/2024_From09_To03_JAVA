package com.pcwk.ehr.ed06;

public class Ex13Member {
	String name;
	String id;
	String password;
	int age;
	
	public Ex13Member(){
		name = "이문터";
		id = "chi";
		password = "cola";
		age = 35;
		System.out.printf("이름 : %s, 아이디 : %s, 비밀번호 : %s, 나이 : %d%n",name,id,password,age);
	}
	
	public Ex13Member(String name, String id) {
		this.name = name;
		this.id = id;
		password = "0000";
		age = 0;
		System.out.printf("이름 : %s, 아이디 : %s, 비밀번호 : %s, 나이 : %d%n",name,id,password,age);
	}

	public Ex13Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	
	
}
