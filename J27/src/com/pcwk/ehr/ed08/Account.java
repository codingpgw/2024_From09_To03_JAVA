package com.pcwk.ehr.ed08;

public class Account {
	private int balance;

	public Account(int balance) {
		this.balance = balance;
	}
	
	//동기화 출금
	public synchronized boolean withdraw(int amount) {
		if(balance >= amount) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= amount;
			System.out.println(Thread.currentThread().getName()+"출금 : "+amount+"\n잔액 : "+balance);
			return true;
		}else {
			System.out.println(Thread.currentThread().getName()+"잔고 부족");
			return false;
		}
	}

	public int getBalance() {
		return balance;
	}
	
}
