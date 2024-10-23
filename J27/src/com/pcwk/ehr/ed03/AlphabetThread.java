package com.pcwk.ehr.ed03;

public class AlphabetThread extends Thread {

	@Override
	public void run() {
		for(char ch='A'; ch<='I'; ch++) {
			System.out.println("Alphabet : "+ch);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//0.5초 간 대기
		}
	}

}
