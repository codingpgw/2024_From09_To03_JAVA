package com.pcwk.ehr.ed02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	static final Logger log = LogManager.getLogger(Main.class);
	
	public static void main(String[] args) {
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
		myDog.sound();
		myCat.sound();
	}

}
//Animal() 생성자
//Dog() 생성자
//Animal() 생성자
//Cat() 생성자
//강아지가 멍멍 짖습니다.
//고양이가 야옹하고 웁니다.
