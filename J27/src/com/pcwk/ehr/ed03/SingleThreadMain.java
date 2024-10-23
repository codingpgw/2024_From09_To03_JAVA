package com.pcwk.ehr.ed03;

public class SingleThreadMain {

	public static void printNumbers() {
		for(char ch='A'; ch<='I'; ch++) {
			System.out.println("Alphabet : "+ch);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//0.5초 간 대기
		}
	}
	
	public static void printAlphabets() {
		for(int i=1; i<=10; i++) {
			System.out.println("Number : "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//0.5초 간 대기
		}
	}
	
	public static void main(String[] args) {
		
		//Task1
		printNumbers();
		
		//Task2
		printAlphabets();

	}

}
