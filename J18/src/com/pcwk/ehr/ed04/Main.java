package com.pcwk.ehr.ed04;

public class Main {

	public static void main(String[] args) {
		User u = new User("John", "철득");
		System.out.println(u.getUserId());
		System.out.println(u.getUserName());
		System.out.println(u);
		System.out.println(u.hashCode());
		
		System.out.println("===============================");
		RUser ru = new RUser("John", "철득");
		System.out.println(ru.userId());
		System.out.println(ru.userName());
		System.out.println(ru);
		System.out.println(ru.hashCode());
	}

}
