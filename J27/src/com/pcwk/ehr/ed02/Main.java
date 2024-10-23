package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) {
			myRunnable mr = new myRunnable();
			Thread thread = new Thread(mr);
			
			thread.start();
	}

}
