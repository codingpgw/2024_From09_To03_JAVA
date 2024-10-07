package com.pcwk.ehr.ex01;

public class SoundableExample {
	public static void printSound(Soundable sa) {
		System.out.println(sa.sound());
	}
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}

