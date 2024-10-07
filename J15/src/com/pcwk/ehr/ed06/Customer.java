package com.pcwk.ehr.ed06;

public class Customer {
	private int money = 50000;
	private int rewardPoints;
	
	Coffee[] item = new Coffee[17];//구입 제품 저장하기 위한 배열
	int i = 0;
	
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
	
	//요약
	public void summary() {
		int sum = 0;//구매 총금액
		String itemList = "";
		
		for(int i=0; i<item.length;i++) {
			//구입한 커피 만큼 반복문 처리
			if(null == item[i]) {
				break;
			}
			
			sum += item[i].getPrice();
			itemList += item[i].getName()+", ";
		}
		System.out.println("총 금액 : "+sum+"원 입니다.");
		System.out.println("구매 목록 : "+itemList);
		
	}
	
	//커피구매 메서드
	public void buyCoffee(Coffee coffee) {
		
		if(money < coffee.getPrice()) {
			System.out.println("잔액이 부족합니다.");
			return ;
		}
		
		money -= coffee.getPrice();
		rewardPoints += coffee.getBonusPoint();
		
		item[i++] = coffee;//제품을 Coffee[] item 에 담기
		
		System.out.println(coffee.getName()+"을(를) 구매하셨습니다.");
	}
	
}
