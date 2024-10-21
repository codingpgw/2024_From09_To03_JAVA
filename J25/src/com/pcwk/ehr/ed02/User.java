package com.pcwk.ehr.ed02;

public class User {
	private String name;
	private int age;
	private boolean isActive;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, int age, boolean isActive) {
		super();
		this.name = name;
		this.age = age;
		this.isActive = isActive;
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
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", isActive=" + isActive + "]";
	}
	
	
}
