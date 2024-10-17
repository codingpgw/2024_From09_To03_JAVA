package com.pcwk.ehr.projectTest;

import java.util.ArrayList;
import java.util.List;

public class Member {
	public String id;
	public String pass;
	public String name;
	public boolean manager;
	public int wallet;
	public int age;
	public List<MovieList> reservations;

	public Member(String id, String pass, String name, boolean manager, int wallet, int age) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.manager = manager;
		this.wallet = wallet;
		this.age = age;
		this.reservations = new ArrayList<>(); //초기화
	}

	public void addReservation(MovieList movie) {
		reservations.add(movie); // 예매 정보 추가
	}

	public List<MovieList> getReservations() {
		return reservations; // 예매 정보 반환
	}

	public void cancelReservation(MovieList movie) {
		reservations.remove(movie); // 예매 정보 취소
	}
}
