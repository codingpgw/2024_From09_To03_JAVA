package com.pcwk.ehr.ed10;

public class Main {

	public static void main(String[] args) {
		NumericBox<Integer> intBox = new NumericBox<Integer>(99);
		System.out.println(intBox.getDoubleNumber());
		
		NumericBox<Double> doubleBox = new NumericBox<Double>(13.45);
		System.out.println(doubleBox.getDoubleNumber());
		
		//Number이거나 Number를 상속받은 클래스만 담을 수 있다. 
		//NumericBox<String> stringBox = new NumericBox<String>("12.34");
	}

}
