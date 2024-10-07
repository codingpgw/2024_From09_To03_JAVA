package com.pcwk.ehr.ed09;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		Bird bird = new Bird();
		Cat cat = new Cat();
		
		//동물원에 동물객체 추가
		zoo.addAnimal(bird);
		zoo.addAnimal(cat);
		zoo.addAnimal(new Dog());
		
		//동물들 소리
		zoo.animalSound();
		
		System.out.println("======================");
		zoo.animalMove();
		
	}

}
