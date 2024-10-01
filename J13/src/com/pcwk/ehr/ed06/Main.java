package com.pcwk.ehr.ed06;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		
		System.out.println("==========================");
		Animal dog01 = new Dog();
		Animal cat01 = new Cat();
		
		dog01.sound();
		cat01.sound();
	}

}
