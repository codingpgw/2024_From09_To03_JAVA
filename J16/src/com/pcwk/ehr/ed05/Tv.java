package com.pcwk.ehr.ed05;

public class Tv implements RemoteControl {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}else if(volume<MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.printf("Tv 볼륨 : %d%n",this.volume);
	}

}
