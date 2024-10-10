package com.pcwk.ehr.project01;

public class Member {
	public String id;
	public String pass;
	public String name;
	public boolean manager;
	
	public Member(String id, String pass, String name, boolean manager) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.manager = manager;
	}
}
