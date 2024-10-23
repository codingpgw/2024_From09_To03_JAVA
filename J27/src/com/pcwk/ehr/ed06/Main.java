package com.pcwk.ehr.ed06;

public class Main {

	public static void main(String[] args) {
		DaemonThread dt = new DaemonThread();
		
		dt.setDaemon(true);
		
		dt.start();
		
		try {
			Thread.sleep(20*1000);//20초
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}

	}

}
