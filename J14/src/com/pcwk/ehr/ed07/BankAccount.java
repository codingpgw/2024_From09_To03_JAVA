/**
 * Package Name : com.pcwk.ehr.ed07
 * Class Name : BankAccount.java
 * Description : 
 * Modification information : 
 * --------------------------------
 * 
 *
 * 최초 생성일 : 2024-10-01
 *---------------------------------
 * author : gy
 * since : 2024.09.09
 * see : 
 * copyright (C) by PCWK All right reserved
 */
package com.pcwk.ehr.ed07;

/**
 * 
 */
public class BankAccount {
	
	private double balance;//잔고, 외부 접근 차단

	public BankAccount(double initialBalance) {
		super();
		this.balance = initialBalance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	//잔고조회 메서드
	public double getBalance() {
		return balance;
	}
	
	//입급
	public void deposit(double amount) {
		//유효성 검사
		if(amount > 0) {
			balance += amount;
		}else {
			System.out.println("입금할 수 없는 금액입니다.");
		}
	}
	
	//출금
	public void withdraw(double amount) {
		//유효성 검사
		 if(amount <= 0) {
		        System.out.println("출금할 금액은 0보다 커야 합니다.");
		    } else if(balance < amount) {
		        System.out.println("잔고가 부족합니다. 현재 잔고: " + balance);
		    } else {
		        balance -= amount;
		        System.out.println("성공적으로 출금되었습니다. 남은 잔고: " + balance);
		    }
	}
}
