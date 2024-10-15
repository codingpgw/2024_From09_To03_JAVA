package com.pcwk.ehr.ed06;

public class Main {

	public static void main(String[] args) {
		
		Product<Tv, String> p1 = new Product<>();
		
		p1.setType(new Tv());
		p1.setModel("스마트 TV");
		
		Tv tv = p1.getType();
		String tvModel = p1.getModel();
		System.out.println(tv+","+tvModel);
		
		System.out.println("================================");
		Product<Car, String> p2 = new Product<>();
		
		p2.setType(new Car());
		p2.setModel("SUV");
		
		Car car = p2.getType();
		String carModel = p2.getModel();
		System.out.println(car+","+carModel);
		
	}

}
