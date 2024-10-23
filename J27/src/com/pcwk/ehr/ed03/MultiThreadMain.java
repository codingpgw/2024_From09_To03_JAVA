package com.pcwk.ehr.ed03;

public class MultiThreadMain {

	public static void main(String[] args) {
		NumberThread nt = new NumberThread();
		
		AlphabetThread at = new AlphabetThread();
		
		nt.start();
		at.start();

	}

}
