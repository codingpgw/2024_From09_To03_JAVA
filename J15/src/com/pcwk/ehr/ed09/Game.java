package com.pcwk.ehr.ed09;

public abstract class Game {
	
	//일반 메서드
	public final void play() {
		initialize();
		startPlay();
		endPlay();
	}
	
	//추상 메서드
	//게임 초기화 기능
	abstract void initialize();
	
	//게임 시작
	abstract void startPlay();
	
	//게임 종료
	abstract void endPlay();
	
}
