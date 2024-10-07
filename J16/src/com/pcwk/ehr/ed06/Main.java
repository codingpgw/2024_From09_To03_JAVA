package com.pcwk.ehr.ed06;

public class Main {

	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Tv();
		Tv tv = new Tv();
		tv.search("gg");
		tv.turnOn();
		
		rc.turnOn();
		
		Searchable sc = new Tv();
		sc.search("www.google.co.kr");

	}

}
