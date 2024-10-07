package com.pcwk.ehr.ed05;

public class Main {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Tv();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(false);
		
	}

}
