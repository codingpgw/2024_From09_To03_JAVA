package com.pcwk.ehr.ed08;

public class BankMain {

	public static void main(String[] args) throws InterruptedException {
		//스레드를 람다식으로 생성
		
		Account account = new Account(1000);
		
		Thread person01 = new Thread(() -> {
			for(int i=0;i<3;i++) {
				account.withdraw(400);
			}
			
		},"person01");
		
		Thread person02 = new Thread(() -> {
			for(int i=0;i<3;i++) {
				account.withdraw(400);
			}
			
		},"person02");
		
		person01.start();
		
		person02.start();
		
		person01.join();
		person02.join();
		
	}

}
