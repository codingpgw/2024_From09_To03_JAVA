package com.pcwk.ehr.ed09;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private List<Animal> animals = new ArrayList<>();
	
	//동물 추가
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	//동물들이 소리를 냅니다.
	public void animalSound() {
		for(Animal animal : animals) {
			animal.sound();
		}
	}
	
	//동물들이 이동합니다.
	public void animalMove() {
		for(Animal animal : animals) {
			animal.move();
		}
	}
}
