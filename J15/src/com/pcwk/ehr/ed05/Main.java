package com.pcwk.ehr.ed05;

public class Main {

	public static void main(String[] args) {
		Customer cs = new Customer(500_000);
		
		cs.buyCoffee(new Americano());
		
		System.out.println("잔액 : "+cs.getMoney());
		
		cs.buyCoffee(new CaffeLatte());
		System.out.println("잔액 : "+cs.getMoney());
		System.out.println("누적 포인트 : "+cs.getRewardPoints());
	}

}
