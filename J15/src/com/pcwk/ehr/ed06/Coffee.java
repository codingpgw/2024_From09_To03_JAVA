package com.pcwk.ehr.ed06;

public class Coffee {
	//가격, 적립금
	private int price;
	private int bonusPoint;
	
	public Coffee(int price) {
		this.price = price;
		this.bonusPoint = (int)(price * 0.1);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	public String getName() {
		return "Generic 커피";
	}
	
	
}
