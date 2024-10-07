package com.pcwk.ehr.ex03;

public class OracleDao implements DataAccessObject {
	//대문자 to 소문자 : ctrl + shift + y
	//소문자 to 대문자 : ctrl + shift + x
	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");

	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에 삽입");

	}

	@Override
	public void update() {
		System.out.println("Oracle DB를 수정");

	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");

	}

}
