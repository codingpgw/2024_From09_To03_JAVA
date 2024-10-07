package com.pcwk.ehr.ed06;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//JDK 1.9 private 메서드
	private void newNine() {
		System.out.println("private 메서드");
		System.out.println("메서드 기능을 분리");
	}
	
	//JDK 1.8 정적 메서드
	static void changeBattery() {
		System.out.println("리모컨 건전기를 교체합니다.");
	}
	
	//JDK 1.8 디폴트 메서드
	default void setMute(boolean mute) {
		if(mute == true) {
			System.out.println("음소거를 합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("음소거를 해제합니다.");
		}
		
		newNine();
	}
	
	//추상 메서드
	
	void setVolume(int volume);
	
	/**
	 * 전원 on 기능을 구현하세요.
	 */
	
	void turnOn();
	
	void turnOff();
	
	
}
