/**
 * Package Name : com.pcwk.ehr.ed07
 * Class Name : Main.java
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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 */
public class Main {
	static final Logger log = LogManager.getFormatterLogger(Main.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		log.debug("캡슐화(Encapsulation");
		
		
		BankAccount bankAccount = new BankAccount(100_000_000);
		
		double balance = bankAccount.getBalance();
		log.debug("잔고 : %.1f\n",balance);
		
		//인출
		bankAccount.withdraw(10_000_000);
		balance = bankAccount.getBalance();
		log.debug("잔고 : %.1f\n",balance);
		
		//입금:
		bankAccount.deposit(5000_000);
		balance = bankAccount.getBalance();
		log.debug("잔고 : %.1f\n",balance);
		
	}

}
//[2024-10-01 15:06:08] DEBUG Main.main(Main.java:30) - 캡슐화(Encapsulation
//[2024-10-01 15:06:08] DEBUG Main.main(Main.java:36) - 잔고 : {}
//
//성공적으로 출금되었습니다. 남은 잔고: 9.0E7
//[2024-10-01 15:06:08] DEBUG Main.main(Main.java:41) - 잔고 : 90000000.0
//
//[2024-10-01 15:06:08] DEBUG Main.main(Main.java:46) - 잔고 : 95000000.0
//

