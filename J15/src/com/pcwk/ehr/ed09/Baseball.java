package com.pcwk.ehr.ed09;

public class Baseball extends Game {

	@Override
	void initialize() {
		System.out.println("Baseball 게임 초기화");
		
	}

	@Override
	void startPlay() {
		System.out.println("Baseball 게임 시작");
		
	}

	@Override
	void endPlay() {
		System.out.println("Baseball 게임 종료");
		
	}

}
