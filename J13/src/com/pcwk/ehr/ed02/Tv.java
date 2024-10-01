package com.pcwk.ehr.ed02;

public class Tv {
	boolean power;//전원 상태(on/off)
	int channel;//현재 채널
	int volume;//현재 볼륨
	public Tv() {
		
	}
	
	//전원 상태(on/off) 메서드
	public void power() {
		power = !power;//전원 토글
		
		if(power == true) {
			System.out.println("Tv전원이 켜졌습니다.");
		}else {
			System.out.println("Tv전원이 꺼졌습니다.");
		}
	}
	
	//채널 증가 메서드
	public void channelUp() {
		channel++;
		System.out.println("채널 : "+channel);
	}
	//채널 감소 메서드
	public void channelDown() {
		channel--;
		System.out.println("채널 : "+channel);
	}
	//볼륨 증가 메서드
	public void volumeUp() {
		volume++;
		System.out.println("볼륨 : "+volume);
	}
	//볼륨 감소 메서드
	public void volumeDown() {
		volume--;
		System.out.println("볼륨 : "+volume);
	}
	
	
	
}
