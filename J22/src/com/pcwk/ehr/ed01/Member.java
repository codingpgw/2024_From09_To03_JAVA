package com.pcwk.ehr.ed01;

public class Member {
	//아이디 이름 비번
	private String id;
	private String name;
	private String pass;
	public String getId() {
		return id;
	}
	
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String name, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
