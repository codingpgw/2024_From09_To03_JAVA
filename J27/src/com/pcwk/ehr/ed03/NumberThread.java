package com.pcwk.ehr.ed03;

public class NumberThread extends Thread {

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Number : "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//0.5초 간 대기
		}
	}
	
}
