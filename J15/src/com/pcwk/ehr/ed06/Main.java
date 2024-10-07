package com.pcwk.ehr.ed06;

public class Main {

	public static void main(String[] args) {
		Customer cs = new Customer(500000);
		
		cs.buyCoffee(new Americano());
		cs.buyCoffee(new CaffeLatte());
		cs.buyCoffee(new CaffeMocha());
		
		cs.summary();
		System.out.println("잔액 : "+cs.getMoney());
		System.out.println("누적 포인트 : "+cs.getRewardPoints());
	}

}
