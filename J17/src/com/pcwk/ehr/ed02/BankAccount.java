package com.pcwk.ehr.ed02;

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	//출금
	public void withdraw(double amount) throws PcwkException {
		if(amount > balance) {
			//잔액 부족 시 예외 발생
			throw new PcwkException("잔액이 부족합니다. 잔액을 확인하세요. \n잔액 : "+balance);
		}
		
		balance -= amount;
		System.out.println(amount+"원 출금이 완료되었습니다. \n잔액 : "+balance);
	}
	
}
