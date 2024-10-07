package com.pcwk.ehr.ed02;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	//추상 메서드
	
	void setVolume(int volume);
	
	/**
	 * 전원 on 기능을 구현하세요.
	 */
	
	void turnOn();
	
	void turnOff();
	
	
}
