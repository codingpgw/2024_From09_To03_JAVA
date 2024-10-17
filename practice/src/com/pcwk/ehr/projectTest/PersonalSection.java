package com.pcwk.ehr.projectTest;

public class PersonalSection {

	public static boolean isLogined() {
		return LoginedMember.getInstance().loginedMember != null;
	}

	public static void login(Member member) {
		LoginedMember.getInstance().loginedMember = member;
	}

	public static void logout() {
		LoginedMember.getInstance().loginedMember = null;
	}

	public static Member getLoginedMember() {
		return LoginedMember.getInstance().loginedMember;
	}
	 // Add other user session-related methods here
}
