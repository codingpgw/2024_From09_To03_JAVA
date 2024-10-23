package com.pcwk.ehr.ed04;

import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * Person클래스 버전 관리
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	public Person() {
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
