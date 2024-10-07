package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) {
//		Tv tv = new Tv();
//		tv.turnOn();
//		
//		Audio audio = new Audio();
//		audio.turnOn();
		
		RemoteControl rc = null;
		rc = new Tv();
		rc.turnOn();
		
		rc.setVolume(7);
		
		rc.turnOff();
		
		System.out.println("===============================");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
	
		
	}

}
