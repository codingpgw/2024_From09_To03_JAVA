package com.pcwk.ehr.ed09;

public class Main {
	
	public static <T> void printArray(T[] array) {
		for(T t : array) {
			System.out.println(t);
		}
	}
	
	public static void main(String[] args) {
		Integer[] intArray = {18,15,13};
		String[] strArray = {"1","2","3"};
		
		//제너릭 메서드
		printArray(intArray);
		printArray(strArray);
		
	}

}
