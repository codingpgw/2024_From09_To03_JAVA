package com.pcwk.ehr.ed05;

public class Card {
	static final int KIND_MAX = 4;// 무늬 4종
	static final int NUM_MAX = 13;//무늬별 카드 수 13개
	
	final static int SPADE = 4;
	final static int DIAMOND = 3;
	final static int HEART = 2;
	final static int CLOVER = 1;
	
	int kind;//무늬
	int number;//숫자
	

	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public Card() {
		//또 다른 생성자 call
		this(SPADE,1);
	}
	
	public String toString() {
		//무늬 : CLOVER == 1, HEART == 2, DIAMOND == 3, SPADE == 4
		String[] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};
		String numbers = "0123456789XJQK"; //0->A, X->10
		return "무늬 : "+kinds[this.kind]+", 숫자 : "+numbers.charAt(number);
	}
	
}
