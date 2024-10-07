package com.pcwk.ehr.ed03;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//JDK 1.8 디폴트 메서드
	default void setMute(boolean mute) {
		if(mute == true) {
			System.out.println("음소거를 합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("음소거를 해제합니다.");
		}
	}
	
	//추상 메서드
	
	void setVolume(int volume);
	
	/**
	 * 전원 on 기능을 구현하세요.
	 */
	
	void turnOn();
	
	void turnOff();
	
	
}
