package com.pcwk.ehr.ed05;

public class Deck {
	final int CARD_NUM = 52;
	
	Card[] cardArray = new Card[CARD_NUM];

	public Deck() {
		int k = 0;
		for(int i=Card.KIND_MAX; i>0; i--) {
			for(int j = 0; j<Card.NUM_MAX; j++) {
				cardArray[k++] = new Card(i,j+1);
			
			}
		}
//		System.out.println(Arrays.toString(cardArray));
	}
	
	public Card pick(int index) {
		return cardArray[index];
	}
	
	public Card pick() {
		return pick(0);
	}
	
	public void shuflle() {
		for(int i=0; i<CARD_NUM; i++) {
			int n = (int)(Math.random()*CARD_NUM);
			Card temp = cardArray[i];
			cardArray[i] = cardArray[n];
			cardArray[n] = temp;
		}
//		System.out.println("=================shuflle===================");
//		System.out.println(Arrays.toString(cardArray));
	}
	
}
