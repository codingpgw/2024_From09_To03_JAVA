package com.pcwk.ehr.ed01;

public class Tv implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");

	}

}
