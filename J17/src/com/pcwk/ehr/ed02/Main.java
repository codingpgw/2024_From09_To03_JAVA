package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount(50_000);
		
		try {
			ba.withdraw(32_000);
		} catch (PcwkException e) {
			System.out.println("PcwkException : "+e.getMessage());
		}
		
	}

}
