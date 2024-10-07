package com.pcwk.ehr.ed05;

public class Customer {
	private int money = 50000;
	private int rewardPoints;
	
	public Customer(int money) {
		this.money = money;
		this.rewardPoints = 0;
	}
	
	public int getMoney() {
		return money;
	}
	
	public int getRewardPoints() {
		return rewardPoints;
	}

	//커피구매 메서드
	public void buyCoffee(Coffee coffee) {
		
		if(money < coffee.getPrice()) {
			System.out.println("잔액이 부족합니다.");
			return ;
		}
		
		money -= coffee.getPrice();
		rewardPoints += coffee.getBonusPoint();
		
		System.out.println(coffee.getName()+"을(를) 구매하셨습니다.");
	}
	
}
