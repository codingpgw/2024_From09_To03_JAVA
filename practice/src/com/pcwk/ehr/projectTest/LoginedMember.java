package com.pcwk.ehr.projectTest;

import java.util.ArrayList;
import java.util.List;

public class LoginedMember {
	private static LoginedMember instance; // 싱글톤 인스턴스
	private List<Member> members;
	public Member loginedMember;

	private LoginedMember() {
	        members = new ArrayList<>();
	        FileHandler.loadMembers(members);
	        loginedMember = null;
	    }

	public static LoginedMember getInstance() {
		if (instance == null) {
			instance = new LoginedMember();
		}
		return instance;
	}

}
