package com.pcwk.ehr.ed03;

public class Main {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Tv();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();

	}

}
