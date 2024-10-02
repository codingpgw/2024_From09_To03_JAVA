package com.pcwk.ehr.ed10;

public class Main {

	public static void main(String[] args) {
		//Cannot instantiate the type Animal
		//Animal animal = new Animal(); //추상 클래스는 스스로 객체 생성 불가, 하위 클래스를 통해 생성.
		Animal dog = new Dog();
		Animal cat = new Cat();
		dog.sound();
		dog.eat();
		
		System.out.println("==============");
		cat.sound();
		cat.eat();
		
	}

}
