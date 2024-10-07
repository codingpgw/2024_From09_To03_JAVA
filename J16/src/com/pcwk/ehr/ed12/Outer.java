package com.pcwk.ehr.ed12;

public class Outer {
	
	interface Greeting{
		void sayAnonymous();
	}
	
	void greet() {
		Greeting greeting = new Greeting() {

			@Override
			public void sayAnonymous() {
				System.out.println("오늘은 즐겁지 않은 월요일");
				
			}
			
		};
		greeting.sayAnonymous();
		
	}
	
}
