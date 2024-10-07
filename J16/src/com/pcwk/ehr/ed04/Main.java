package com.pcwk.ehr.ed04;

public class Main {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Tv();
		rc.turnOn();
		rc.setVolume(-2);
		rc.setMute(true);
		rc.setMute(false);
		System.out.println("----------------------------");
		RemoteControl.changeBattery();
		
	}

}
