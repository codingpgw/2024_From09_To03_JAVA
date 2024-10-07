package com.pcwk.ehr.ed01;

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
		
		rc = new Audio();
		rc.turnOn();
		
	}

}
